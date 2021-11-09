import java.util.Map;

import static java.util.Map.entry;
import org.antlr.v4.runtime.ParserRuleContext;

public class Tool {    
    private static final Map<String, Integer> funcLength = Map.ofEntries(
        entry("getint", 0),
        entry("getch", 0),
        entry("putint", 1),
        entry("putch", 1)
        );

    private static final Map<String, String> funcType = Map.ofEntries(
            entry("getint", "i32"),
            entry("getch", "i32"),
            entry("putint", "void"),
            entry("putch", "void")
            );
    public static Map<String, Integer> getFunclength() {
        return funcLength;
    }
    public static Map<String, String> getFunctype() {
        return funcType;
    }
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
    static String getOp(ParserRuleContext op){

        switch (op.getText()) {
            case "+":
                return "add";
            case "-":
                return "sub";
            case "*":
                return "mul";
            case "/":
                return "sdiv";
            case "%":
                return "srem";
        }
        return null;
    }
    static boolean checkFunc(String func, int size){
        if (!Tool.getFunctype().containsKey(func)){
            return false;
        }
        if (Tool.getFunclength().get(func) != size){
            return false;
        }
        return true;
    }
}
