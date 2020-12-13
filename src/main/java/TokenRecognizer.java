import Utils.ConsoleColors;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;

import java.util.List;

public class TokenRecognizer {

    private CommonTokenStream tokens;
    private List<Token> tokenList;
    private Vocabulary vocabulary;

    public TokenRecognizer(CommonTokenStream tokens, Vocabulary vocabulary) {
        this.tokens = tokens;
        this.tokenList = tokens.getTokens();
        this.vocabulary = vocabulary;
    }

    public void recognizeTokens() {
        do {
            tokens.consume();
        } while (tokens.LA(1) != -1);
        for (Token token : tokenList) {
            int tokenType = token.getType();
            String tokenSymbolicName = vocabulary.getSymbolicName(tokenType);
            String tokenValue = token.getText();

            // check if an ID token is longer than 31 characters
            if (tokenSymbolicName.equals("T_ID") && tokenValue.length() > 31) {
                ErrorListener errorListener = new ErrorListener();
                errorListener.syntaxError(null, token.getText(), token.getLine(), token.getCharPositionInLine(), "LARGE_ID", null);
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
