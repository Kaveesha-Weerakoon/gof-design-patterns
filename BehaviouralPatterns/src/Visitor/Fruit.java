package Visitor;


class Fruit implements ItemElement {
    private String name;
    private double weight;
    private int pricePerKg;

    public Fruit(String name, double weight, int pricePerKg) {
        this.name = name;
        this.weight = weight;
        this.pricePerKg = pricePerKg;
    }

    public String getName() { return name; }
    public double getWeight() { return weight; }
    public int getPricePerKg() { return pricePerKg; }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}