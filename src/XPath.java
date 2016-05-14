/**
 * Created by YueWang on 5/11/16.
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Node;

public class XPath {
    public static void main(String[] args) throws IOException {
        String inputFile = null;
        //if (args.length>0) inputFile = args[0];
        //if (args.length>0) inputFile = "XPathQuery.txt";
        inputFile = "./XPathTest.txt";
        InputStream is = System.in;
        if (inputFile!=null) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        XPathLexer lexer = new XPathLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XPathParser parser = new XPathParser(tokens);
        ParseTree tree = parser.ap();
        XPathCustomizedVisitor eval = new XPathCustomizedVisitor();
        ArrayList<Node> finalResult = eval.visit(tree);

        System.out.println("finalResult size: " + finalResult.size());
        for(Node n:finalResult) {
            System.out.println(n.getNodeName());
        }
    }
}
