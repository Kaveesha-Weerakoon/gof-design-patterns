package Visitor;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[] {
                new Book("Design Patterns", 500),
                new Fruit("Apple", 2.0, 100)
        };

        Visitor visitor = new PriceCalculator();
        for (ItemElement item : items) {
            item.accept(visitor);
        }
    }
}
