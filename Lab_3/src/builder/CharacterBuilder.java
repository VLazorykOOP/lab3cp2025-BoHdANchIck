package builder;

import model.Character;

public interface CharacterBuilder {
    void setName(String name);
    void setStats(int strength, int dexterity, int intelligence);
    void addSkill(String skill);
    void addItem(String item);
    Character build();
}
