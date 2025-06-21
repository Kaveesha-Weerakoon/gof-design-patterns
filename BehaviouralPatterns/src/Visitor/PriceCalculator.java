package Visitor;

class PriceCalculator implements Visitor {
    public void visit(Book book) {
        System.out.println("Book: " + book.getName() + ", Price: $" + book.getPrice());
    }

    public void visit(Fruit fruit) {
        System.out.println("Fruit: " + fruit.getName() + ", Weight: " + fruit.getWeight() + "kg, Total: $" + (fruit.getPricePerKg() * fruit.getWeight()));
    }
}
