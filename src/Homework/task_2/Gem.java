package Homework.task_2;

public class Gem {
    private int id;
    private String name;
    private String preciousness;
    private String origin;
    private String color;
    private byte transparency;
    private byte cuttingMethods;
    private byte value;
    private String valueMeasure;

    public Gem() {
    }

    public Gem(int id, String name, String preciousness, String origin, String color,
               byte transparency, byte cuttingMethods, byte value, String valueMeasure) {
        this.id = id;
        this.name = name;
        this.preciousness = preciousness;
        this.origin = origin;
        this.color = color;
        this.transparency = transparency;
        this.cuttingMethods = cuttingMethods;
        this.value = value;
        this.valueMeasure = valueMeasure;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreciousness() {
        return preciousness;
    }

    public void setPreciousness(String preciousness) {
        this.preciousness = preciousness;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte getTransparency() {
        return transparency;
    }

    public void setTransparency(byte transparency) {
        this.transparency = transparency;
    }

    public byte getCuttingMethods() {
        return cuttingMethods;
    }

    public void setCuttingMethods(byte cuttingMethods) {
        this.cuttingMethods = cuttingMethods;
    }

    public byte getValue() {
        return value;
    }

    public void setValue(byte value) {
        this.value = value;
    }

    public String getValueMeasure() {
        return valueMeasure;
    }

    public void setValueMeasure(String valueMeasure) {
        this.valueMeasure = valueMeasure;
    }

    @Override
    public String toString() {
        return "Gem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", preciousness='" + preciousness + '\'' +
                ", origin='" + origin + '\'' +
                ", color='" + color + '\'' +
                ", transparency=" + transparency +
                ", cuttingMethods=" + cuttingMethods +
                ", value=" + value +
                ", valueMeasure=" + valueMeasure +
                '}';
    }
}
