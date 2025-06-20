import facade.CharacterManager;
import iterator.InventoryIterator;
import iterator.Iterator;
import iterator.SkillIterator;
import model.Character;
import model.Item;
import model.Skill;

public class Main {
    public static void main(String[] args) {
        CharacterManager manager = new CharacterManager();

        Character warrior1 = manager.createDefaultWarrior("Thorin");
        Character warrior2 = manager.createDefaultWarrior("Eowyn");

        warrior2.addSkill(new Skill("Shield Block"));
        warrior2.addItem(new Item("Steel Shield"));

        System.out.println("===== Персонаж 1 =====");
        manager.printCharacter(warrior1);

        System.out.println("\n===== Персонаж 2 =====");
        manager.printCharacter(warrior2);

        System.out.println("\n--- Скіли персонажа 2 ---");
        Iterator<Skill> skillIterator = new SkillIterator(warrior2.getSkills());
        while (skillIterator.hasNext()) {
            Skill skill = skillIterator.next();
            System.out.println("Скіл: " + skill.getName());
        }

        System.out.println("\n--- Інвентар персонажа 2 ---");
        Iterator<Item> itemIterator = new InventoryIterator(warrior2.getInventory());
        while (itemIterator.hasNext()) {
            Item item = itemIterator.next();
            System.out.println("Предмет: " + item.getName());
        }

        System.out.println("\n--- Порівняння сили ---");
        System.out.println(warrior1.getName() + ": " + warrior1.getStrength());
        System.out.println(warrior2.getName() + ": " + warrior2.getStrength());
    }
}
