import java.util.List;

public class Output {
    private static void println(String format, Object ... args){
        System.out.println(String.format(format, args));
    }
    public static void opPrint(String result, String op, String ty, String op1, String op2){
        println("%s = %s %s %s , %s", result, op, ty, op1, op2);
    }
    public static void ret(String register){
        println("ret i32 %s", register);
    }
    public static void alloca(String register){
        println("%s = alloca i32", register);
    }
    public static void load(String reg1, String reg2){
        println("%s = load i32, i32* %s", reg1, reg2);
    }
    public static void store(String reg1, String reg2){
        println("store i32 %s, i32* %s", reg1, reg2);
    }
    public static void call(String func, List<String> list, String reg){
        String funcType = Tool.getFunctype().get(func);
        if (reg != null){
            System.out.printf("%s = ", reg);
        }
        System.out.printf("call %s @%s(", funcType, func);
        for (var s: list){
            System.out.printf("i32 %s", s);
        }
        println(")");
    }
    public static void declare(String func){
        String funcType = Tool.getFunctype().get(func);
        if (funcType.equals("void")){
            println("declare %s @%s(i32)", funcType, func);
        }
        else{
            println("declare %s @%s()", funcType, func);
        }

    }
}
