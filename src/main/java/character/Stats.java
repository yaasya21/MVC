package character;

import java.util.HashMap;
import java.util.Map;

public class Stats {

    private Map<String, Integer> stats;


    public Stats() {
        stats = new HashMap<>();
    }

    public static Stats generate() {
        Stats stats = new Stats();

        stats.stats.put("strength", Dice.roll());
        stats.stats.put("dexterity", Dice.roll());
        stats.stats.put("constitution", Dice.roll());
        stats.stats.put("intelligence", Dice.roll());
        stats.stats.put("wisdom", Dice.roll());
        stats.stats.put("charisma", Dice.roll());

        return stats;
    }
    public Map<String, Integer> getStats() {
        return stats;
    }

    public Integer getConstitution() {
        return stats.get("constitution");
    }
}