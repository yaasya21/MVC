package race;


import character.Stats;

public class Human extends CharacterRace {
    public Human(){
        name = "Human";
        bonuses = new Stats(1,1,1,1,1,1);
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    @Override
    public Stats getRaceBonuses() {
        return bonuses;
    }

    @Override
    public void saySMTH() {
        System.out.println("Hey, I`m " + this.name);
    }
}
