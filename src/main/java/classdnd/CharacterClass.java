package classdnd;

import Visitor.DataElement;
import Visitor.DataElementVisitor;

import java.util.TreeMap;

public abstract class CharacterClass implements DataElement {
    protected String name;
    protected int hp;

    public int getHP() {
        return hp;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return name;
    }

    public abstract void printMagika();
    @Override
    public TreeMap accept(DataElementVisitor vis) {
        return vis.visit((this));
    }
}
