import character.Character;
import factory.HumanFactory;
import factory.DragonbornFactory;
import factory.RaceAbstractFactory;

public class Demo {
    public static void main(String[] args) {
        RaceAbstractFactory human = new HumanFactory();
        Character user1 = new Character("Zelenskiy", human.create());
        user1.talk();

        System.out.println();

        RaceAbstractFactory dragonborn = new DragonbornFactory();
        Character user2 = new Character("Dovah-Kiin", dragonborn.create());
        user2.talk();
    }
}
