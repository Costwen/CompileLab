import java.util.Map;

import static java.util.Map.entry;

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
    private static final Map<String, Integer> typePriority = Map.ofEntries(
                entry("i32", 2),
                entry("i32*", 2),
                entry("i1", 1)
                );
    public static Map<String, Integer> getTypepriority() {
        return typePriority;
    }
    public static boolean cmpPriority(String ty1, String ty2){
        var p1 = typePriority.get(ty1);
        var p2 = typePriority.get(ty2);
        return p1 > p2;
    }
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
    static String getOp(String op){

        switch (op) {
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
            case "!":
                return "icmp eq";
        }
        return null;
    }
    static String getCmpOp(String op){

        switch (op) {
            case ">":
                return "sgt";
            case ">=":
                return "sge";
            case "<":
                return "slt";
            case "<=":
                return "sle";
            case "==":
                return "eq";
            case "!=":
                return "ne";
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
    static String Op(String op, String reg1, String reg2){
        var a = Tool.string2int(reg1);
        var b = Tool.string2int(reg2);
        Integer res = 0;
        switch (op) {
            case "+":
                res = a  + b;
                break;
            case "-":
                res = a - b;
                break;
            case "*":
                res = a * b;
                break;
            case "/":
                res = a / b;
                break;
            case "%":
                res = a % b;
                break;
            case "!":
                res = (b == 0) ? 1 : 0;
        }
        return Integer.toString(res);
    }
}
