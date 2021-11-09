import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Identifier {
    private HashMap<String, String> identSet;   // 记录是否有这个变量, 并且分配一个(指针)寄存器
    private HashMap<String, String> registerType;
    private Set<String> constSet;
    private int regId;
    private int labelId;
    public Identifier(){
        this.identSet = new HashMap<String, String>();
        this.registerType = new HashMap<String, String>();
        this.constSet = new HashSet<String>();
        this.regId = 0;
        this.labelId = 0;
    }
    public Set<String> getConstSet() {
        return constSet;
    }
    public void setConstSet(Set<String> constSet) {
        this.constSet = constSet;
    }
    
    public String getType(String reg){
        var type = this.registerType.get(reg);
        if (type == null){
            return "i32";
        }
        return type;
    }

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
        var register = newRegister("i32");
        this.identSet.put(ident, register);
        return this.identSet.get(ident);
    }

    public String getIdentRegister(String ident){
        if(!this.identSet.containsKey(ident)){
            System.exit(-1);
        }
        return this.identSet.get(ident);
    }
    public boolean hasIdent(String ident){
        return this.identSet.containsKey(ident);
    }
    public boolean isIdentReg(String reg){
        return this.identSet.containsValue(reg);
    }
    public void setIdentRegister(String ident, String register){
        this.identSet.put(ident, register);
    }
    public void addConstSet(String reg){
        this.constSet.add(reg);
    }
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
