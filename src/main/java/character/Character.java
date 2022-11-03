package character;

import Visitor.DataElement;
import Visitor.DataElementVisitor;
import classdnd.CharacterClass;
import race.CharacterRace;

import java.util.TreeMap;


public class Character implements DataElement {
    private String name;
    private CharacterRace race;
    private CharacterClass clas;
    private Stats attributes;
    private int hp;


    public CharacterClass getClas() {
        return clas;
    }

    public CharacterRace getRace() {
        return race;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return hp;
    }

    public Character(String name, CharacterRace race, CharacterClass clas) {
        this.name = name;
        this.clas = clas;
        this.race = race;
        this.attributes = Stats.generate(race);
        this.hp = (int) (clas.getHP() + Math.floor(attributes.getConstitution()/2) - 5); // as addRaceBonuses(no need to add function here)
    }

    public Stats getAttributes() {
        return attributes;
    }

    public void talk(){
        race.saySMTH();
        System.out.println("My name is " + this.name);
        System.out.println("----Attributes----");
        attributes.getStats().entrySet().forEach(System.out::println);
    }

    @Override
    public TreeMap accept(DataElementVisitor vis) {
        return vis.visit((this));
    }
}
