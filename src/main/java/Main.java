import org.antlr.v4.runtime.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        CharStream charStream = CharStreams.fromFileName("/home/meqdad/IdeaProjects/CompilerFree/src/main/java/source.txt");
        FileInputStream fileInputStream = new FileInputStream("/home/meqdad/IdeaProjects/CompilerFree/src/main/java/source.txt");
        grammarFreeLexer lexer = new grammarFreeLexer(charStream);
        CommonTokenStream stream = new CommonTokenStream(lexer);
        grammarFreeParser parser = new grammarFreeParser(stream);

        Vocabulary vocabulary = lexer.getVocabulary();


        CommonTokenStream tokens = new CommonTokenStream(lexer);
        do
        {
            tokens.consume();
        } while (tokens.LA(1) != -1);

        List<Token> tokenList = tokens.getTokens();
        for (Token token : tokenList)
        {
            int type = token.getType();
            String tname = token.getText();
            //bigList.add(type);
            int line = token.getLine();
            System.out.printf("LINE %d - TOKEN %S\n", line, vocabulary.getSymbolicName(type));
        }

//        grammarFreeParser.If_ruleContext tree = parser.if_rule();
//
//        grammarFreeBaseListener compiler = new grammarFreeBaseListener();
//
//        ParseTreeWalker walker = new ParseTreeWalker();
//        walker.walk(compiler, tree);
    }
}
