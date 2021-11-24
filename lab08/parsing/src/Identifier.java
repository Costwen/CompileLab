import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;
import java.util.regex.Pattern;



public class Identifier {
    private static Identifier identifier;
    private LinkedList<HashMap<String, String>> TableList;
    // Ident 2 Reg
    private HashMap<String, String> identTable;

    // RegAttr
    private HashMap<String, String> registerType; 
    private HashMap<String, String> constTable;
    private HashMap<String, ArrayList<String>> constArrayTable;
    private HashMap<String, ArrayList<Integer>> shapeMap;


    private int regId;
    private int labelId;
    private boolean global;
    private Stack<String> l0Stack;
    private Stack<String> l2Stack;

    private int dim;
    private ArrayList<String> initData;
    private ArrayList<Integer> shape;

    
    /**
     * @identTable 当前的变量对应的寄存器标号表
     * @registerType 记录每个寄存器的类型
     * @constSet const类型寄存器
     * @regId  寄存器最大id
     * @labelId 标签最大id
     * @global 是否是全局声明
     */
    private Identifier(){
        this.TableList = new LinkedList<HashMap<String, String>>();
        this.identTable = new HashMap<String, String>();
        this.TableList.add(this.identTable); // 全局变量表
        this.registerType = new HashMap<String, String>();
        this.constTable = new HashMap<String, String>();
        this.regId = 0;
        this.labelId = 0;
        this.global = true;
        this.l0Stack = new Stack<String>();
        this.l2Stack = new Stack<String>();
        this.shapeMap = new HashMap<String, ArrayList<Integer>>();
        this.initData = null;
        this.shape = null;
        this.constArrayTable = new HashMap<String, ArrayList<String>>();
    }
    /**
     * 设置寄存器的形状属性
     * @param reg 要设置的寄存器
     * @param shape 要设置的形状
     */
    public static Identifier getInstance(){
        if (identifier == null){
            identifier = new Identifier();
        }
        return identifier;
    }
    public ArrayList<Integer> getShape() {
        return shape;
    }
    public void setShape(ArrayList<Integer> shape) {
        this.shape = shape;
    }
    public void addInitDate(String value){
        this.initData.add(value);
    }

    public ArrayList<String> getInitData() {
        return initData;
    }
    public void setInitData(ArrayList<String> initData) {
        this.initData = initData;
    }

    public void addDim(){
        this.dim++;
    }
    public void subDim(){
        this.dim--;
    }
    public Integer getDim(){
        return this.dim;
    }
    public void addShape(String reg, ArrayList<Integer> shape){
        shapeMap.put(reg, shape);
    }

    public ArrayList<Integer> getShape(String reg){
        return shapeMap.getOrDefault(reg, new ArrayList<Integer>());
    }
    
    /**
     * 创建一个新表, 并且添加到总表中
     */
    public void newTable(){
        this.identTable = new HashMap<String, String>();
        this.TableList.add(this.identTable);
    }
    /**
     * 去掉最后一个表, 并且还原
     */
    public void removeTable(){
        this.TableList.removeLast();
        this.identTable = TableList.getLast();
    }

    /**
     * 返回寄存器类型 如果是常数返回 i32
     * @param reg  要判断的寄存器或数字
     * @return 返回类型
     */
    public String getType(String reg){
        var type = this.registerType.get(reg);
        if (type == null){
            return "i32";
        }
        return type;
    }
    /**
     * 分配一个type类型的临时寄存器, 如果类型是标签则返回%Lxxx
     * @param type
     * @return 返回分配寄存器的名字
     */
    public String newRegister(String type){
        String registerName = null;
        if (type.equals("label")){
            registerName = "%L" + Integer.toString(this.labelId++);
        }
        else{
            registerName = "%"+ Integer.toString(++this.regId);
        }
        this.registerType.put(registerName, type);
        return registerName;
    }
    /**
     * 给变量分配一个i32*寄存器,并将其加入变量表之中,如果已经有这个变量, 返回-1
     * @param ident
     * @return
     */
    public String alloca(String ident){
        return alloca(ident, "i32*");
    }
    public String alloca(String ident, ArrayList<Integer> shape){
        if (shape.size() == 0)
            return alloca(ident, "i32*");
        else
            return alloca(ident, String.format("[%d x i32]", Tool.getShape(shape, 0))+"*");
    }

    public String alloca(String ident, String type){
        if(this.identTable.containsKey(ident)){
            Output.println("ident %s is already exist", ident);
            System.exit(-1);
        }
        if (global){
            var register = "@" + ident;
            this.identTable.put(ident, register);
            this.registerType.put(register, type);
            return register;
        }
        var register = newRegister(type);
        this.identTable.put(ident, register);
        return this.identTable.get(ident);
    }
    /**
     * 通过变量名, 获取这个变量的存储寄存器
     * @param ident 变量名
     * @return 寄存器编号
     */
    public String getIdentRegister(String ident){
        for (int i = TableList.size() -1; i >= 0; i--){
            var table = TableList.get(i);
            if (table.keySet().contains(ident)){
                return table.get(ident);
            }
        }
        Output.println("%s can't get the register", ident);
        System.exit(-1);
        return null;
    }
    
    /**
     * 判断是不是变量寄存器
     * @param reg 
     * @return 
     */
    public boolean isIdentReg(String reg){
        for (int i = TableList.size() -1; i >= 0; i--){
            var table = TableList.get(i);
            if (table.values().contains(reg)){
                return true;
            }
        }
        return false;
    }

    /**
     * 将寄存器添加到常量池之中
     * @param reg
     */
    public void addConstSet(String reg, String value){
        this.constTable.put(reg, value);
    }
    public void addConstSet(String reg, ArrayList<String> value){
        this.constArrayTable.put(reg, value);
    }

    /**
     * 判断是不是常量寄存器
     * @param reg
     * @return
     */
    public boolean isConst(String reg){
        if (Pattern.matches("-?[0-9]+", reg)){
            return true;
        }
        if (constTable.keySet().contains(reg)){
            return true;
        }
        return false;
    }
    /**
     * 返回常量寄存器的数值, 不存在表中则返回寄存器自己
     * @param reg
     * @return
     */
    public String getConst(String reg){
        var res = constTable.getOrDefault(reg, reg);
        return res;
    }
    /**
     * 设置是否在全局模式
     * @param value
     */
    public void setGlobal(boolean value){
        this.global = value;
    }
    /**
     * 判断是不是全局模式
     * @return 是返回true
     */
    public boolean isGlobal(){
        return this.global;
    }
    /**
     * 添加当前的L0和L2标签到栈中
     * @param L0
     * @param L2
     */
    public void pushL0AndL2(String L0, String L2){
        this.l0Stack.push(L0);
        this.l2Stack.push(L2);
    }
    public void popL0AndL2(){
        this.l0Stack.pop();
        this.l2Stack.pop();
    }
    public String peekL0(){
        return this.l0Stack.peek();
    }
    public String peekL2(){
        return this.l2Stack.peek();
    }
}
