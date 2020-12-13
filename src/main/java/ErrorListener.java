import Utils.ConsoleColors;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class ErrorListener extends BaseErrorListener {

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        if (msg.startsWith("token recognition error")) {
            int colonIndex = msg.indexOf(":");
            offendingSymbol = msg.substring(colonIndex + 2);
            System.out.println(ConsoleColors.RED + "line " + line + ":" + charPositionInLine + " UNDEFINED_TOKEN at: " + offendingSymbol + ConsoleColors.RESET);
        }
        else
            System.out.println(ConsoleColors.RED + "line " + line + ":" + charPositionInLine + " " + msg + " at: '" + offendingSymbol + "'" +ConsoleColors.RESET);
    }
}
