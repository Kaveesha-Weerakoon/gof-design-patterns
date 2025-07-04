package Visitor;

class Book implements ItemElement {
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public int getPrice() { return price; }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
