import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Identifier {

    private HashMap<String, String> identSet;  
    private HashMap<String, String> registerType; 
    private Set<String> constSet;
    private int regId;
    private int labelId;
    /**
     * @identSet 变量寄存器
     * @registerType 记录每个寄存器的类型
     * @constSet const类型寄存器
     * @regId  寄存器最大id
     * @labelId 标签最大id
     */
    public Identifier(){
        this.identSet = new HashMap<String, String>();
        this.registerType = new HashMap<String, String>();
        this.constSet = new HashSet<String>();
        this.regId = 0;
        this.labelId = 0;
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
     * 分配一个type类型的寄存器, 如果类型是标签则返回%Lxxx
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

    public String alloca(String ident){
        if(this.identSet.containsKey(ident)){
            System.exit(-1);
        }
        var register = newRegister("*i32");
        this.identSet.put(ident, register);
        return this.identSet.get(ident);
    }
    /**
     * 获取一个已有的变量寄存器
     * @param ident 变量名
     * @return 寄存器编号
     */
    public String getIdentRegister(String ident){
        if(!this.identSet.containsKey(ident)){
            System.exit(-1);
        }
        return this.identSet.get(ident);
    }

    /**
     * 判断是不是变量寄存器
     * @param reg 
     * @return 
     */
    public boolean isIdentReg(String reg){
        return this.identSet.containsValue(reg);
    }

    /**
     * 将寄存器添加到常量池之中
     * @param reg
     */
    public void addConstSet(String reg){
        this.constSet.add(reg);
    }
    /**
     * 判断是不是常量寄存器
     * @param reg
     * @return
     */
    public boolean isConst(String reg){
        if (!reg.startsWith("%")){
            return true;
        }
        if (constSet.contains(reg)){
            return true;
        }
        return false;
    }
}
