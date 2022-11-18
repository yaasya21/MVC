package Factory;
import classdnd.CharacterClass;
import classdnd.Druid;
import classdnd.Fighter;

public class ClassFactory {
    public static CharacterClass getClass(String type){
        return switch (type) {
            case "Druid" -> new Druid();
            case "Fighter" -> new Fighter();
            default -> throw new IllegalArgumentException("Sorry, no type in database: " + type);
        };
    }
}