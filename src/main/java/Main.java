import Utils.ConsoleColors;
import Utils.grammarFreeLexer;
import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        CharStream charStream = CharStreams.fromFileName("/home/meqdad/IdeaProjects/YaYaCompiler/src/main/java/source.txt");
        grammarFreeLexer lexer = new grammarFreeLexer(charStream);
        Vocabulary vocabulary = lexer.getVocabulary();
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        do {
            tokens.consume();
        } while (tokens.LA(1) != -1);

        List<Token> tokenList = tokens.getTokens();
        for (Token token : tokenList) {
            int tokenType = token.getType();
            String tokenSymbolicName = vocabulary.getSymbolicName(tokenType);
            String tokenValue = token.getText();
            // check if an ID token is longer than 31 characters
            if (tokenSymbolicName.startsWith("ID") && tokenValue.length() > 31) {

            } else if (tokenSymbolicName.startsWith("KEYWORD") || tokenSymbolicName.startsWith("OP")) {
                // just to make output more beautiful :))
                if (tokenSymbolicName.startsWith("KEYWORD")) {
                    System.out.println(ConsoleColors.BLUE + tokenValue + ConsoleColors.RESET);
                } else {
                    System.out.println(tokenValue);
                }
            } else {
                System.out.println(ConsoleColors.GREEN + tokenSymbolicName + " " + tokenValue + ConsoleColors.RESET);
            }
        }
    }
}
