import org.antlr.runtime.Token;

public class Tool {
    static Integer string2int(String number){
        Integer temp;
        if (number.startsWith("0x")||number.startsWith("0X")){
            temp = Integer.valueOf(number.substring(2), 16);
        }
        else if (number.startsWith("0")){
            temp = Integer.valueOf(number, 8);
        }
        else {
            temp = Integer.valueOf(number, 10);
        }
        return temp;
    }
    static String getOp(org.antlr.v4.runtime.Token op){
        switch (op.getType()) {
            case miniSysYParser.Plus:
                return "add";
            case miniSysYParser.Sub:
                return "sub";
            case miniSysYParser.Mul:
                return "mul";
            case miniSysYParser.Div:
                return "sdiv";
            case miniSysYParser.Mod:
                return "srem";
        }
        return null;
    }
}
