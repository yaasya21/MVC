package race;

import java.util.ArrayList;
import java.util.List;

public class Druid extends CharacterRace {
    private List<String> spells;

    public Druid() {
        this.name = "Druid";
        this.spells = new ArrayList();
        this.spells.add("Healing Word");
        this.spells.add("Animal Shape");
        this.health = 8;
    }

    @Override
    public void printMagika() {
        System.out.println(name + " knows that magic spells: ");
        for (String spell : spells) {
            System.out.println(spell);
        }
    }
}
