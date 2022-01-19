package Homework.additional;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        XMLInputFactory factory = XMLInputFactory.newFactory();
        List<Candy> candies = new ArrayList<>();
        int sugar = 0;
        String sugarMeasure = "";
        int weight = 0;
        String weightMeasure = "";


        Reader reader = new FileReader("C:\\Users\\user\\IdeaProjects\\Web_Services_2" +
                "\\src\\Homework\\additional\\candies.xml");

        XMLStreamReader xmlStreamReader = factory.createXMLStreamReader(reader);

        while (xmlStreamReader.hasNext()) {
            switch (xmlStreamReader.next()) {

                case XMLStreamReader.START_ELEMENT:
                    String elem = xmlStreamReader.getName().toString();
                    switch (elem) {
                        case "sugar":
                            sugarMeasure = xmlStreamReader.getAttributeValue(0);
                            sugar = Integer.parseInt(xmlStreamReader.getElementText());
                            break;
                        case "weight":
                            weightMeasure = xmlStreamReader.getAttributeValue(0);
                            weight = Integer.parseInt(xmlStreamReader.getElementText());
                            Candy candy = new Candy();
                            candy.setSugar(sugar);
                            candy.setSugarMeasure(sugarMeasure);
                            candy.setWeight(weight);
                            candy.setWeightMeasure(weightMeasure);
                            candies.add(candy);
                            break;
                    }
                    break;
            }
        }
        for (Candy cnd : candies) {
            System.out.println(cnd);
        }
    }
}
