package Decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee(); // Basic coffee
        coffee = new MilkDecorator(coffee); // Add milk
        coffee = new SugarDecorator(coffee); // Add sugar

        System.out.println("Order: " + coffee.getDescription());
        System.out.println("Total cost: $" + coffee.getCost());
    }
}
