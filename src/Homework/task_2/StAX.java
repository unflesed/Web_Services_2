package Homework.task_2;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StAX {
    public static void main(String[] args) throws XMLStreamException, FileNotFoundException {
        XMLInputFactory factory = XMLInputFactory.newFactory();
        List<Gem> gems = new ArrayList<>();
        int id = 0;
        String name = "";
        String preciousness = "";
        String origin = "";
        String color = "";
        byte transparency = 0;
        byte cuttingMethods = 0;
        byte value = 0;
        String valueMeasure = "";


        Reader reader = new FileReader("C:\\Users\\user\\IdeaProjects\\" +
                "Web_Services_2\\src\\Homework\\task_2\\diamonds.xml");

        XMLStreamReader xmlStreamReader = factory.createXMLStreamReader(reader);

        while (xmlStreamReader.hasNext()) {
            switch (xmlStreamReader.next()) {

                case XMLStreamReader.START_ELEMENT:
                    String elem = xmlStreamReader.getName().toString();
                    switch (elem) {
                        case "Gem":
                            id = Integer.parseInt(xmlStreamReader.getAttributeValue(0));
                            break;
                        case "Name":
                            name = xmlStreamReader.getElementText();
                            break;
                        case "Preciousness":
                            preciousness = xmlStreamReader.getElementText();
                            break;
                        case "Origin":
                            origin = xmlStreamReader.getElementText();
                            break;
                        case "color":
                            color = xmlStreamReader.getElementText();
                            break;
                        case "transparency":
                            transparency = Byte.parseByte(xmlStreamReader.getElementText());
                            break;
                        case "cutting_methods":
                            cuttingMethods = Byte.parseByte(xmlStreamReader.getElementText());
                            break;
                        case "Value":
                            valueMeasure = xmlStreamReader.getAttributeValue(0);
                            value = Byte.parseByte(xmlStreamReader.getElementText());
                            gems.add(new Gem(id, name, preciousness, origin, color, transparency, cuttingMethods,
                                    value, valueMeasure));
                            break;
                    }
                    break;
            }
        }
        Comparator comparator = new ValueComparator();

        Collections.sort(gems, comparator);
        for (Gem gem : gems) {
            System.out.println(gem);
        }
    }
}
