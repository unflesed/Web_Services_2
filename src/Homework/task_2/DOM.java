package Homework.task_2;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DOM {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        GemHelper gh = new GemHelper();

        List<Gem> gems = gh.getAll();
        Comparator comparator = new NameComparator();

        Collections.sort(gems, comparator);

        for (Gem gem: gems) {
            System.out.println(gem);
        }
    }
}
