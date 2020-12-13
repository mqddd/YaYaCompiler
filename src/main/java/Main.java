import Utils.grammarFreeLexer;
import org.antlr.v4.runtime.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        CharStream charStream = CharStreams.fromFileName("/home/meqdad/IdeaProjects/YaYaCompiler/src/main/java/source.txt");

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
