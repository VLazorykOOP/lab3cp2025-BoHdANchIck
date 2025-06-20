package builder;

import model.Character;

public class Director {
    public Character createDefaultWarrior(String name) {
        CharacterBuilder builder = new WarriorBuilder();
        builder.setName(name);
        builder.setStats(10, 5, 2); // сила, спритність, інтелект
        builder.addSkill("Slash");
        builder.addItem("Iron Sword");
        return builder.build();
    }
}
