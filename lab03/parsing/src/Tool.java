import org.antlr.v4.runtime.ParserRuleContext;

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
}
