import character.Character;
import factory.DruidFactory;
import factory.FighterFactory;
import factory.RaceAbstractFactory;

public class Demo {
    public static void main(String[] args) {
        RaceAbstractFactory druid = new DruidFactory();
        Character user1 = new Character("DruidDruidich", druid.create());
        user1.talk();

        System.out.println();

        RaceAbstractFactory fighter = new FighterFactory();
        Character user2 = new Character("Fighter for freedom", fighter.create());
        user2.talk();
    }
}
