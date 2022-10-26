package factory;

import race.CharacterRace;
import race.Fighter;

public class FighterFactory implements RaceAbstractFactory {
    @Override
    public CharacterRace create() {
        return new Fighter();
    }
}
