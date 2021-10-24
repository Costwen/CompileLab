import java.util.HashMap;
import org.antlr.v4.runtime.ParserRuleContext;
public class Identifier {
    private HashMap<ParserRuleContext, String> set;
    private int id;
    public Identifier(){
        this.set = new HashMap<ParserRuleContext, String>();
        this.id = 0;
    }
    public String getRegister(ParserRuleContext ctx){
        if (!this.set.containsKey(ctx)){
            this.set.put(ctx, "%x"+ Integer.toString(this.id));
            this.id++;
        }
        return this.set.get(ctx);
    }
    public void setRegister(ParserRuleContext ctx1, ParserRuleContext ctx2){
        this.set.put(ctx1, this.set.get(ctx2));
    }
    public void setRegister(ParserRuleContext ctx, String number){
        this.set.put(ctx, number);
    }
}
