package race;

import java.util.ArrayList;
import java.util.List;

public class Fighter extends CharacterRace{
    private List<String> spells;

    public Fighter() {
        this.name = "Fighter";
        this.spells = new ArrayList();
        this.spells.add("Extra Attack");
        this.health = 10;
    }

    @Override
    public void printMagika() {
        System.out.println(name + " knows that magic spells: ");
        for (String spell : spells) {
            System.out.println(spell);
        }
    }
}
