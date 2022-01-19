package Homework.task_2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GemHelper {
    Document document;
    public GemHelper() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setIgnoringElementContentWhitespace(true);

        DocumentBuilder db = dbf.newDocumentBuilder();

        document = db.parse("C:\\Users\\user\\IdeaProjects\\Web_Services_2\\src\\Homework\\task_2\\diamonds.xml");
    }
    public List<Gem> getAll(){
        List<Gem> gems = new ArrayList<>();

        Element root = document.getDocumentElement();

        NodeList list = root.getElementsByTagName("Gem");

        for (int i = 0; i < list.getLength(); i++) {
            Node node = list.item(i);
            int id = Integer.parseInt(node.getAttributes().item(0).getNodeValue());
            String name = root.getElementsByTagName("Name").item(i).getFirstChild().getTextContent();
            String preciousness = root.getElementsByTagName("Preciousness").item(i).getFirstChild().getTextContent();
            String origin = root.getElementsByTagName("Origin").item(i).getFirstChild().getTextContent();
            String color = root.getElementsByTagName("color").item(i).getFirstChild().getTextContent();
            byte transparency = Byte.parseByte(root.getElementsByTagName("transparency").item(i).getFirstChild().getTextContent());
            byte cuttingMethods = Byte.parseByte(root.getElementsByTagName("cutting_methods").item(i).getFirstChild().getTextContent());
            byte value = Byte.parseByte(root.getElementsByTagName("Value").item(i).getFirstChild().getTextContent());
            String valueMeasure =  root.getElementsByTagName("Value").item(i).getAttributes().item(0).getNodeValue();

            gems.add(new Gem(id, name, preciousness, origin, color, transparency, cuttingMethods,
                    value, valueMeasure));
        }

        return gems;
    }
}
