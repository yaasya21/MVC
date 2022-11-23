package character;

import Memento.MementoPattern;
import Visitor.DataElement;
import Visitor.DataElementVisitor;
import race.CharacterRace;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Stats implements DataElement {

    private Map<String, Integer> stats;


    public Stats() {
        stats = new HashMap<>();
    }

    public Stats(int strength,
                 int dexterity,
                 int constitution,
                 int intelligence,
                 int wisdom,
                 int charisma) {

        stats = new HashMap<>();

        stats.put("strength", strength);
        stats.put("dexterity", dexterity);
        stats.put("constitution", constitution);
        stats.put("intelligence", intelligence);
        stats.put("wisdom", wisdom);
        stats.put("charisma", charisma);
    }

    public Stats(HashMap<String, Integer> stats) {
        this.stats = stats;
    }

    public static Stats generate(CharacterRace bonus) {
        Stats stats = new Stats();

        stats.stats.put("strength", Dice.roll() + bonus.getRaceBonuses().getStat("strength"));
        stats.stats.put("dexterity", Dice.roll() + bonus.getRaceBonuses().getStat("dexterity"));
        stats.stats.put("constitution", Dice.roll() + bonus.getRaceBonuses().getStat("constitution"));
        stats.stats.put("intelligence", Dice.roll() + bonus.getRaceBonuses().getStat("intelligence"));
        stats.stats.put("wisdom", Dice.roll() + bonus.getRaceBonuses().getStat("wisdom"));
        stats.stats.put("charisma", Dice.roll() + bonus.getRaceBonuses().getStat("charisma"));

        return stats;
    }

    public int getStat(String str) {
        return stats.get(str);
    }

    public Map<String, Integer> getStats() {
        return stats;
    }

    public Integer getConstitution() {
        return stats.get("constitution");
    }
    @Override
    public TreeMap accept(DataElementVisitor vis) {
        return vis.visit((this));
    }

    public MementoPattern saveStateToMemento() {
        return new MementoPattern(stats);
    }

    public void getSateFromMemento(MementoPattern memento) {
        Stats mementoState = memento.getStats();
        this.stats = mementoState.stats;
    }

    @Override
    public String toString() {
        return " " + stats;
    }
}