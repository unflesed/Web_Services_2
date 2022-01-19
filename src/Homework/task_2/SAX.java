package Homework.task_2;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SAX {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        GemHandler gh = new GemHandler();

        File file = new File("C:\\Users\\user\\IdeaProjects\\Web_Services_2\\src\\" +
                "Homework\\task_2\\diamonds.xml");

        parser.parse(file, gh);

        List<Gem> gems = gh.getGems();

        Comparator comparator = new TransparencyComparator();

        Collections.sort(gems, comparator);

        for (Gem gem: gems) {
            System.out.println(gem);
        }
    }
}
