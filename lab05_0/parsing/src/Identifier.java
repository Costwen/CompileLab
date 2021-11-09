import java.util.HashMap;

public class Identifier {
    private HashMap<String, Register> identRegister;
    private HashMap<String, Register> nameRegister;
    public HashMap<String, Register> getNameRegister() {
        return nameRegister;
    }
    public void setNameRegister(HashMap<String, Register> nameRegister) {
        this.nameRegister = nameRegister;
    }

    private int id;
    public Identifier(){
        this.identRegister = new HashMap<String, Register>();
        this.nameRegister = new HashMap<String, Register>();
        
        this.id = 0;
    }
    public Register newRegister(String type, Boolean isConst){
        var register = new Register(type, this.id++, isConst);
        nameRegister.put(register.getName(), register);
        return register;
    }
    
    public Register newRegister(String type, String ident, Boolean isConst){
        if(this.identRegister.containsKey(ident)){
            System.exit(-1);
        }
        var register = newRegister(type, isConst);
        identRegister.put(ident, register);
        return register;
    }

    public Register getRegisterByIdent(String ident){
        if(!this.identRegister.containsKey(ident)){
            System.exit(-1);
        }
        return this.identRegister.get(ident);
    }
    
    public Register getRegisterByName(String name){
        return this.nameRegister.get(name);
    }
    
    public boolean isConstReg(String reg){
        if (!reg.startsWith("%x")){
            return true;
        }
        return nameRegister.get(reg).isConst();
    }
}
