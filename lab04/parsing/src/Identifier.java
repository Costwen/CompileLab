import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.antlr.v4.runtime.ParserRuleContext;
public class Identifier {
    private HashMap<ParserRuleContext, String> registerSet; // 记录每个变量的常量寄存器
    private HashMap<String, String> identSet;   // 记录是否有这个变量, 并且分配一个(指针)寄存器
    private Set<String> constSet;
    private int id;
    public Identifier(){
        this.registerSet = new HashMap<ParserRuleContext, String>();
        this.identSet = new HashMap<String, String>();
        this.constSet = new HashSet<String>();
        this.id = 0;
    }
    public Set<String> getConstSet() {
        return constSet;
    }
    public void setConstSet(Set<String> constSet) {
        this.constSet = constSet;
    }
    public String getRegister(ParserRuleContext ctx){
        if (!this.registerSet.containsKey(ctx)){
            this.registerSet.put(ctx, "%x"+ Integer.toString(this.id));
            this.id++;
        }
        return this.registerSet.get(ctx);
    }
    public String getTempRegister(){
        return "%x"+ Integer.toString(this.id++);
    }

    public String alloca(String ident){
        if(this.identSet.containsKey(ident)){
            System.exit(-1);
        }
        this.identSet.put(ident, "%x"+ Integer.toString(this.id));
        this.id++;

        return this.identSet.get(ident);
    }
    public void setRegister(ParserRuleContext ctx1, ParserRuleContext ctx2){
        this.registerSet.put(ctx1, this.registerSet.get(ctx2));
    }
    public void setRegister(ParserRuleContext ctx, String number){
        this.registerSet.put(ctx, number);
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
        if (!reg.startsWith("%x")){
            return true;
        }
        if (constSet.contains(reg)){
            return true;
        }
        return false;
    }
}
