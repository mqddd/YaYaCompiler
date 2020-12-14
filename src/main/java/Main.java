import Utils.grammarFreeLexer;
import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        String sourceAddress = in.next();
        CharStream charStream = CharStreams.fromFileName(sourceAddress);

        ErrorListener errorListener = new ErrorListener();

        grammarFreeLexer lexer = new grammarFreeLexer(charStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        Vocabulary vocabulary = lexer.getVocabulary();

        TokenRecognizer tokenRecognizer = new TokenRecognizer(tokens, vocabulary);
        tokenRecognizer.recognizeTokens();
    }
}
