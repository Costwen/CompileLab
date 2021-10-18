import org.antlr.v4.runtime.tree.ParseTree;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        File file = new File(args[0]);
        FileReader r = new FileReader(file);
        File outputFile = new File(args[1]);
        if(!outputFile.exists())    
        {    
            try {    
                outputFile.createNewFile();    
            } catch (IOException e) {    
                // TODO Auto-generated catch block    
                e.printStackTrace();    
            }    
        }        
        System.setOut(new PrintStream(outputFile));
        CharStream inputStream = CharStreams.fromReader(r);
        miniSysYLexer lexer = new miniSysYLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        miniSysYParser parser = new miniSysYParser(tokens);
        ErrorListener listener = new ErrorListener();
        parser.addErrorListener(listener);
        ParseTree tree = parser.compUnit();
        Visitor visitor = new Visitor();
        System.out.println(visitor.visit(tree));
        System.exit(0);
    }
}
