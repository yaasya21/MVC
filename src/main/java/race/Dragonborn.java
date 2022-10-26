package race;

import character.Stats;

public class Dragonborn extends CharacterRace{
    public Dragonborn(){
        name = "Dragonborn";
        bonuses = new Stats(2,0,0,0,0,1);
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    public Stats getRaceBonuses() {
        return bonuses;
    }
    @Override
    public void saySMTH() {
        System.out.println("Hey, I`m " + this.name);
    }
}
