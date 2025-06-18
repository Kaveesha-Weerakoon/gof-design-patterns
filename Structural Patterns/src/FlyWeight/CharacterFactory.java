package FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private Map<java.lang.Character, ConcreteCharacter> characterMap = new HashMap<>();

    public Character getCharacter(char c) {
        if (!characterMap.containsKey(c)) {
            characterMap.put(c, new ConcreteCharacter(c));
        }
        return characterMap.get(c);
    }
}
