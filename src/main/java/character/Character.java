package character;

import race.CharacterRace;


public class Character {
    private String name;
    private CharacterRace race;
    private Stats attributes;


    public CharacterRace getRace() {
        return race;
    }



    public Character(String name, CharacterRace race) {
        this.name = name;
        this.race = race;
        this.attributes = Stats.generate(race);
    }


    public void talk(){
        race.saySMTH();
        System.out.println("My name is " + this.name);
        System.out.println("----Attributes----");
        attributes.getStats().entrySet().forEach(System.out::println);
    }
}
