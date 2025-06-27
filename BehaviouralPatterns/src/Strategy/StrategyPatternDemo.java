package Strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Pay with Credit Card
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(500); // Output: Paid 500 using Credit Card.

        // Switch to PayPal
        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(300); // Output: Paid 300 using PayPal.
    }
}
