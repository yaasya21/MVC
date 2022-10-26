package factory;

import race.CharacterRace;
import race.Human;

public class HumanFactory implements RaceAbstractFactory{
    @Override
    public CharacterRace create() {
        return new Human();
    }
}
