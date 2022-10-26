package factory;

import race.CharacterRace;
import race.Druid;

public class DruidFactory implements RaceAbstractFactory{
    @Override
    public CharacterRace create() {
        return new Druid();
    }
}
