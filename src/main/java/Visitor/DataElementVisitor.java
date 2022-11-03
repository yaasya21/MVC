package Visitor;

import character.Character;
import character.Stats;
import classdnd.CharacterClass;
import race.CharacterRace;

import java.util.TreeMap;

public interface DataElementVisitor {
    TreeMap visit(Character cr);
    TreeMap visit(CharacterClass cl);
    TreeMap visit(CharacterRace cr);
    TreeMap visit(Stats st);

}
