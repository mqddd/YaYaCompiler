import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        CharStream charStream = CharStreams.fromFileName("/home/meqdad/IdeaProjects/CompilerFree/src/main/java/source.txt");
        FileInputStream fileInputStream = new FileInputStream("/home/meqdad/IdeaProjects/CompilerFree/src/main/java/source.txt");
        grammarFreeLexer lexer = new grammarFreeLexer(charStream);
        CommonTokenStream stream = new CommonTokenStream(lexer);
        grammarFreeParser parser = new grammarFreeParser(stream);

        grammarFreeParser.If_ruleContext tree = parser.if_rule();

        grammarFreeBaseListener compiler = new grammarFreeBaseListener();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(compiler, tree);
    }
}
