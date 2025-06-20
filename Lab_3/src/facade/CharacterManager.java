package facade;

import builder.Director;
import model.Character;

public class CharacterManager {
    private Director director = new Director();

    public Character createDefaultWarrior(String name) {
        return director.createDefaultWarrior(name);
    }

    public void printCharacter(Character character) {
        System.out.println(character);
    }

}
