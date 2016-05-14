// Generated from /Users/BANG/Desktop/CSE 232B/Project/myProject/antlrXQuery/src/XPath.g4 by ANTLR 4.5.1
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * This class provides an empty implementation of {@link XPathVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 */
public class XPathCustomizedVisitor extends XPathBaseVisitor<ArrayList<Node>> {

    private ArrayList<Node> curr = new ArrayList<>();
    private boolean hasAttribute = false;

    @Override
    public ArrayList<Node> visitApChildren(XPathParser.ApChildrenContext ctx) {
        return visitChildren(ctx); // ???
    }

    private static ArrayList<Node> children(Node n){
        ArrayList<Node> childrenList = new ArrayList<Node>();
        for(int i = 0; i < n.getChildNodes().getLength(); i++){
            childrenList.add(n.getChildNodes().item(i));
        }
        return childrenList;
    }

    @Override
    public ArrayList<Node> visitApAll(XPathParser.ApAllContext ctx) {
        ArrayList<Node> res = new ArrayList<>();
        LinkedList<Node> ll = new LinkedList<>();
        visit(ctx.doc());
        res.addAll(curr);
        ll.addAll(curr);
        while(!ll.isEmpty()) {
            Node temp = ll.poll();
            res.addAll(children(temp));
            ll.addAll(children(temp));
        }
        curr = res;
        return visit(ctx.rp());
    }

    @Override
    public ArrayList<Node> visitDoc(XPathParser.DocContext ctx) {
        File xmlFile = new File(ctx.fname().getText()); //dont know whats in xmlFile
        DocumentBuilderFactory docBF = DocumentBuilderFactory.newInstance();
        DocumentBuilder docB = null;
        try {
            docB = docBF.newDocumentBuilder();
        } catch (ParserConfigurationException pE1) {
            pE1.printStackTrace();
        }
        Document doc = null; //use for what
        try {
            if (docB != null) {
                doc = docB.parse(xmlFile);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        if (doc != null) {
            doc.getDocumentElement().normalize();
        }
        ArrayList<Node> res = new ArrayList<>();
        res.add(doc);
        curr = res;
        return res;

    }

    @Override
    public ArrayList<Node> visitAllChildren(XPathParser.AllChildrenContext ctx) {
        ArrayList<Node> res = new ArrayList<>();
        for(Node temp : curr) {
            res.addAll(children(temp));
        }
        curr = res;
        return res;
    }

    @Override
    public ArrayList<Node> visitRpwithP(XPathParser.RpwithPContext ctx) {
        return visit(ctx.rp());
    }

    @Override
    public ArrayList<Node> visitTagName(XPathParser.TagNameContext ctx) {
        ArrayList<Node> res = new ArrayList<>();
        String tName = ctx.getText();
        for(Node temp : curr) {
            ArrayList<Node> nodeList = children(temp);
            for(Node i : nodeList) {
                if(i.getNodeName().equals(tName)) res.add(i);
            }
        }
        curr = res;
        return res;
    }

    @Override
    public ArrayList<Node> visitRpAll(XPathParser.RpAllContext ctx) {
        ArrayList<Node> res = new ArrayList<>();
        LinkedList<Node> ll = new LinkedList<>();
        visit(ctx.rp(0));
        res.addAll(curr);
        ll.addAll(curr);
        while(!ll.isEmpty()) {
            Node temp = ll.poll();
            res.addAll(children(temp));
            ll.addAll(children(temp));
        }
        curr = res;
        return visit(ctx.rp(1));
    }

    @Override
    public ArrayList<Node> visitParent(XPathParser.ParentContext ctx) {
        ArrayList<Node> res = new ArrayList<>();
        for(Node temp : curr) {
            if(!res.contains(temp.getParentNode())) res.add(temp.getParentNode());
        }
        curr = res;
        return res;
    }

    @Override
    public ArrayList<Node> visitAttribute(XPathParser.AttributeContext ctx) { //???
        ArrayList<Node> res = new ArrayList<>();
        hasAttribute = true;
        for (Node temp : curr) {
            Element e = (Element) temp;
            String attr = e.getAttribute(ctx.NAME().getText());
            if (!attr.equals("")) {
                res.add(temp);
                attr = ctx.NAME().getText()+"=\""+ attr +"\"";
                System.out.println(attr);
            }
        }
        curr = res;
        return res;
    }

    @Override
    public ArrayList<Node> visitRpChildren(XPathParser.RpChildrenContext ctx) {
        visit(ctx.rp(0));
        ArrayList<Node> res = visit(ctx.rp(1));
        curr = res;
        return res;
    }

    @Override
    public ArrayList<Node> visitText(XPathParser.TextContext ctx) { //???
        for (Node temp :curr) {
            for (int i = 0; i < temp.getChildNodes().getLength(); i++) {
                if (temp.getChildNodes().item(i).getNodeType() == javax.xml.soap.Node.TEXT_NODE && !temp.getChildNodes().item(i).getTextContent().equals("\n")) {
                    System.out.print(temp.getChildNodes().item(i).getTextContent());
                }
            }
        }
        return curr; //curr didnt change why return it
    }

    @Override
    public ArrayList<Node> visitCurrent(XPathParser.CurrentContext ctx) {
        return curr;
    }

    @Override
    public ArrayList<Node> visitTwoRp(XPathParser.TwoRpContext ctx) { //???
        ArrayList<Node> res1 = new ArrayList<>();
        ArrayList<Node> res2 = new ArrayList<>();
        ArrayList<Node> tempList = new ArrayList<>(curr);
        res1.addAll(visit(ctx.rp(0)));
        curr = tempList;
        res2.addAll(visit(ctx.rp(1)));
        res1.addAll(res2);

        curr = res1;
        return res1;
    }

    @Override
    public ArrayList<Node> visitRpFilter(XPathParser.RpFilterContext ctx) { //???
        ArrayList<Node> res = visit(ctx.rp());
        ArrayList<Node> filter= visit(ctx.filter());
        if (hasAttribute) {
            curr = filter;
            hasAttribute = false;
            return filter;
        }
        else if (filter.isEmpty()) {
            return new ArrayList<>();
        }
        else return res;
    }

    @Override
    public ArrayList<Node> visitFilAnd(XPathParser.FilAndContext ctx) {
        ArrayList<Node> left = visit(ctx.filter(0));
        ArrayList<Node> right = visit(ctx.filter(1));
        if (!left.isEmpty() && !right.isEmpty()) {
            return left;
        }
        else return new ArrayList<>();
    }

    @Override
    public ArrayList<Node> visitFilEqual(XPathParser.FilEqualContext ctx) {
        ArrayList<Node> tempList = curr;
        ArrayList<Node> left = visit(ctx.rp(0));
        curr = tempList;
        ArrayList<Node> right = visit(ctx.rp(1));
        curr = tempList;
        for (Node i : left) {
            for (Node j : right) {
                if (i.isEqualNode(j)) {
                    return tempList;
                }
            }
        }
        return new ArrayList<>();
    }

    @Override
    public ArrayList<Node> visitFilNot(XPathParser.FilNotContext ctx) {
        ArrayList<Node> res = visit(ctx.filter());
        if (!res.isEmpty()) {
            return curr;
        }
        else return new ArrayList<>();
    }

    @Override public ArrayList<Node> visitFilOr(XPathParser.FilOrContext ctx) {
        ArrayList<Node> left = visit(ctx.filter(0));
        ArrayList<Node> right = visit(ctx.filter(1));
        if (!left.isEmpty() || !right.isEmpty()) {
            return curr;
        }
        else return new ArrayList<>();
    }

    @Override
    public ArrayList<Node> visitFilIs(XPathParser.FilIsContext ctx) {
        ArrayList<Node> tempList = curr;
        ArrayList<Node> left = visit(ctx.rp(0));
        curr = tempList;
        ArrayList<Node> right = visit(ctx.rp(1));
        curr = tempList;
        for (Node i : left) {
            for (Node j : right) {
                if (i == j) {
                    return tempList;
                }
            }
        }
        return new ArrayList<>();
    }

        @Override
        public ArrayList<Node> visitFilwithP(XPathParser.FilwithPContext ctx) {
            return visit(ctx.filter());
        }

        @Override
        public ArrayList<Node> visitFilRp(XPathParser.FilRpContext ctx) {
            ArrayList<Node> tempList = curr;
            ArrayList<Node> res = visit(ctx.rp());
            curr = tempList;
            return res;
        }
    }