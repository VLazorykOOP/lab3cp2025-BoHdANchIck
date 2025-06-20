package builder;

import model.Character;
import model.Item;
import model.Skill;

public class WarriorBuilder implements CharacterBuilder {
    private Character character;

    public WarriorBuilder() {
        character = new Character();
    }

    @Override
    public void setName(String name) {
        character.setName(name);
    }

    @Override
    public void setStats(int strength, int dexterity, int intelligence) {
        character.setStrength(strength);
        character.setDexterity(dexterity);
        character.setIntelligence(intelligence);
    }

    @Override
    public void addSkill(String skill) {
        character.addSkill(new Skill(skill));
    }

    @Override
    public void addItem(String item) {
        character.addItem(new Item(item));
    }

    @Override
    public Character build() {
        return character;
    }
}
