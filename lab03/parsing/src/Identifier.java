import java.util.HashMap;
import org.antlr.v4.runtime.ParserRuleContext;
public class Identifier {
    private HashMap<ParserRuleContext, Integer> set;
    private int id;
    public Identifier(){
        this.set = new HashMap<ParserRuleContext, Integer>();
        this.id = 0;
    }
    public String getRegister(ParserRuleContext ctx){
        if (!this.set.containsKey(ctx)){
            this.set.put(ctx, this.id++);
        }
        return "%x" + this.set.get(ctx).toString();
    }
    public void setRegister(ParserRuleContext ctx1, ParserRuleContext ctx2){
        this.set.put(ctx1, this.set.get(ctx2));
    }
    public void setRegister(ParserRuleContext ctx, String number){
        if (number.startsWith("%x")){
            this.set.put(ctx, Integer.valueOf(number.substring(2)));
        }
        else {
            this.set.put(ctx, Integer.valueOf(number));
        }
    }
}
