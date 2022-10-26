package character;

import race.CharacterRace;

public class Character {
    private String name;
    private int hp;
    private CharacterRace race;
    private Stats attributes;

    public Character(String name, CharacterRace race) {
        this.name = name;
        this.race = race;
        this.attributes = Stats.generate();
        this.hp = (int) (race.getHealth() + Math.floor(attributes.getConstitution()/2) - 5); // as addRaceBonus()
    }

    public void talk(){
        System.out.printf("Name:" + name + " Race: " + race.getName());
        System.out.println("\n----Attributes----");
        attributes.getStats().entrySet().forEach(System.out::println);
        System.out.println("----------");
        race.printMagika();
        System.out.println("His HP is " + hp);
    }

}
