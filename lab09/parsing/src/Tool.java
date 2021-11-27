import java.util.Map;

import static java.util.Map.entry;

import java.util.ArrayList;

public class Tool {   
    static Identifier identifier = Identifier.getInstance();
    public static void init()
    {
        identifier.addFunc("getint", "i32", new ArrayList<String>());
        identifier.addFunc("getch", "i32", new ArrayList<String>());
        var i32Params = new ArrayList<String>();
        i32Params.add("i32");
        identifier.addFunc("putint", "void", i32Params);
        identifier.addFunc("putch", "void", i32Params);

        var pi32Params = new ArrayList<String>();
        pi32Params.add("i32*");
        identifier.addFunc("getarray","i32", pi32Params);

        var Params2 = new ArrayList<String>();
        Params2.add("i32");
        Params2.add("i32*");
        identifier.addFunc("putarray","void", Params2);

        Output.declare("getarray");
        Output.declare("putarray");
        Output.declare("getint");
        Output.declare("putint");
        Output.declare("getch");
        Output.declare("putch");
        
        
    }
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


    static boolean checkFunc(String func, ArrayList<String> params){
        var funcType = identifier.getFuncType(func);
        var funcParams = identifier.getFuncParams(func);
 
        if (funcType == null){
            return false;
        }
        if (funcParams.size() != params.size()){
            return false;
        }

        for (int i = 0; i < funcParams.size(); i++){
            var shape1 = identifier.getShape(funcParams.get(i));
            var shape2 = identifier.getShape(params.get(i));
            if (shape1.size() != shape2.size()){
                return false;
            }
            for (int j = 1; j < shape1.size(); j++){
                if (shape1.get(i) != shape2.get(i)){
                    return false;
                }
            }
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
    public static Integer getShape(ArrayList<Integer> shape, Integer idx){
        Integer prob = 1;
        for (int i = idx; i < shape.size(); i++){
            prob *= shape.get(i);
        }
        return prob;
    }
    public static String getArrayValue(ArrayList<String> data){
        String value = "[";
        for (int i = 0; i < data.size(); i++){
            value = value + "i32 " + data.get(i);
            if (!identifier.isConst(data.get(i))){
                Output.exit("global must be init with const");
            }
            if (i != data.size()-1){
                value += ", ";
            }
        }
        value += "]";
        return value;
    }
    static String getType(ArrayList<Integer> shape){
        var type = "i32";
        if (shape.size() > 0){
            type += "*";
        }
        return type;
    }
    
}
