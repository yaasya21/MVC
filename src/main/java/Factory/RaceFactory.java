package Factory;

import race.CharacterRace;
import race.Dragonborn;
import race.Human;

public class RaceFactory {
    public static CharacterRace getRace(String type){
        return switch (type) {
            case "Dragonborn" -> new Dragonborn();
            case "Human" -> new Human();
            default -> throw new IllegalArgumentException("Sorry, no type in database: " + type);
        };
    }
}