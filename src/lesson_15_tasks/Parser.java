package lesson_15_tasks;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Parser {


    private void parser(String uri) throws ParserConfigurationException, IOException, SAXException {
        Document doc = null;

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        DocumentBuilder db = dbf.newDocumentBuilder();
        doc = db.parse(uri);
        if (doc != null) {
            printDom(doc);
        }
    }

    private void printDom(Document node) {
        int type = node.getNodeType();

        switch (type) {
            case Node.DOCUMENT_NODE:
                System.out.println("<?xml version=\"1.0");
                Document d;
                printDom((Document) node.getDocumentElement());
                break;
            case Node.ELEMENT_NODE:
                System.out.println("<");
                System.out.println(node.getNodeName());
                NamedNodeMap attrs  = node.getAttributes();
                for (int i = 0; i < attrs.getLength(); i++) {
                    printDom((Document) attrs.item(i));
                }
                System.out.println(">");
                if (node.hasChildNodes()) {
                    NodeList children = node.getChildNodes();
                    for (int i = 0; i < children.getLength(); i++) {
                        printDom((Document) children.item(i));
                    }
                }
                System.out.println("</" + node.getNodeName() + ">");
                break;
            case Node.ATTRIBUTE_NODE:
                System.out.println(" " + node.getNodeName() + "='" + node.getNodeValue() + "'");
                break;
            case Node.TEXT_NODE:
                System.out.println(node.getNodeValue());
            default:
                break;
        }
    }

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {

        new Parser().parser("src/books.xml");


    }
}
