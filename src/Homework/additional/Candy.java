package Homework.additional;

public class Candy {
    private int sugar;
    private String sugarMeasure;
    private int weight;
    private String weightMeasure;

    public Candy() {
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public String getSugarMeasure(String attributeValue) {
        return sugarMeasure;
    }

    public void setSugarMeasure(String sugarMeasure) {
        this.sugarMeasure = sugarMeasure;
    }

    public int getWeight(int i) {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getWeightMeasure() {
        return weightMeasure;
    }

    public void setWeightMeasure(String weightMeasure) {
        this.weightMeasure = weightMeasure;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "sugar=" + sugar +
                ", sugarMeasure='" + sugarMeasure + '\'' +
                ", weight=" + weight +
                ", weightMeasure='" + weightMeasure + '\'' +
                '}';
    }
}
