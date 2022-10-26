package race;

import character.Stats;

public abstract class CharacterRace {
    protected String name;
    protected Stats bonuses;

    public abstract void print();
    public abstract Stats getRaceBonuses();
    public abstract void saySMTH();

}
