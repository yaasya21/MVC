package factory;

import race.CharacterRace;
import race.Dragonborn;

public class DragonbornFactory implements RaceAbstractFactory {
    @Override
    public CharacterRace create() {
        return new Dragonborn();
    }
}
