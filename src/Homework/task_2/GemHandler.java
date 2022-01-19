package Homework.task_2;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class GemHandler extends DefaultHandler {
    private String currentQName;
    private List<Gem> gems;
    private Gem currentGem;
    private String currentAttribute;

    public GemHandler() {
        gems = new ArrayList<>();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes){
        currentQName = qName;
        if (attributes.getLength() > 0) {
            currentAttribute = attributes.getValue(0);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        String value = new String(ch, start, length);
        switch (currentQName) {
            case "Gem":
                currentGem = new Gem();
                currentGem.setId(Integer.parseInt(currentAttribute));
                break;
            case "Name":
                currentGem.setName(value);
                break;
            case "Preciousness":
                currentGem.setPreciousness(value);
                break;
            case "Origin":
                currentGem.setOrigin(value);
                break;
            case "color":
                currentGem.setColor(value);
                break;
            case "transparency":
                currentGem.setTransparency(Byte.parseByte(value));
                break;
            case "cutting_methods":
                currentGem.setCuttingMethods(Byte.parseByte(value));
                break;
            case "Value":
                currentGem.setValue(Byte.parseByte(value));
                currentGem.setValueMeasure(currentAttribute);
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        currentQName = "";
        if (qName.equals("Gem")) {
            gems.add(currentGem);
        }
    }

    public List<Gem> getGems() {
        return gems;
    }
}
