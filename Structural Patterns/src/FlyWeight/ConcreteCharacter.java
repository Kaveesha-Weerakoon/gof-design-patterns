package FlyWeight;

public class ConcreteCharacter implements Character {
    private char symbol; // Intrinsic state (shared)

    public ConcreteCharacter(char symbol) {
        this.symbol = symbol;
    }

    public void display(int x, int y) {
        // Extrinsic state: position
        System.out.println("Displaying '" + symbol + "' at (" + x + ", " + y + ")");
    }
}

