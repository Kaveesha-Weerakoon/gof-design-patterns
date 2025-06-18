package FlyWeight;

public class FlyweightPatternDemo {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        String document = "ABACAB";
        int x = 0;

        for (char c : document.toCharArray()) {
            Character character = factory.getCharacter(c);
            character.display(x, 10); // Extrinsic state (x, y)
            x += 10;
        }
    }
}
