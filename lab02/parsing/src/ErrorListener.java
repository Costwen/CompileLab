import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class ErrorListener extends BaseErrorListener{
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
            String msg, RecognitionException e) {
        // TODO Auto-generated method stub
        // System.err.println("行" + line + "列" + charPositionInLine + "非法符号: " +offendingSymbol + ". 原始原因:" + msg);
        System.exit(-1);
    }
}
