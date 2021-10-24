import java.util.HashMap;
import org.antlr.v4.runtime.ParserRuleContext;
public class Identifier {
    private HashMap<ParserRuleContext, Integer> set;
    private int id;
    public Identifier(){
        this.set = new HashMap<ParserRuleContext, Integer>();
        this.id = 0;
    }
    public String getName(ParserRuleContext ctx){
        if (!this.set.containsKey(ctx)){
            this.set.put(ctx, this.id++);
        }
        return "%x" + this.set.get(ctx).toString();
    }
}
