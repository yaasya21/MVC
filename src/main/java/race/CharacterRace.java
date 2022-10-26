package race;

import java.util.List;

public abstract class CharacterRace {
    protected String name;
    protected int health;

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CharacterRace{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }

    public abstract void printMagika();
}
