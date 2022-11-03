package Visitor;
import character.Character;
import character.Stats;
import classdnd.CharacterClass;
import race.CharacterRace;

import java.util.TreeMap;

public class ElementVisitor implements DataElementVisitor {
    @Override
    public TreeMap visit(Character ch) {
        TreeMap vis = new TreeMap();
        vis.put("Name", ch.getName());
        vis.put("HP", ch.getHP());
        return vis;
    }

    @Override
    public TreeMap visit(CharacterClass cl) {
        TreeMap vis = new TreeMap();
        vis.put("Class", cl.toString());
        return vis;
    }

    @Override
    public TreeMap visit(CharacterRace cr) {
        TreeMap vis = new TreeMap();
        vis.put("Race", cr.toString());
        return vis;
    }

    @Override
    public TreeMap visit(Stats st) {
        TreeMap vis = new TreeMap();
        vis.put("Attributes", st.getStats());
        return vis;
    }
}
