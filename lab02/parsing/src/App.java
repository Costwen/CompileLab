import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileReader;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


public class App {
    public static void main(String[] args) throws Exception {
        File file = new File("input.c");
        FileReader r = new FileReader(file);
        CharStream inputStream = CharStreams.fromReader(r);
        miniSysYLexer lexer = new miniSysYLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        miniSysYParser parser = new miniSysYParser(tokens);
        ErrorListener listener = new ErrorListener();
        parser.addErrorListener(listener);
        ParseTree tree = parser.compUnit();
        Visitor visitor = new Visitor();
        System.out.println(visitor.visit(tree));
    }
}
