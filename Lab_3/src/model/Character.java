package model;

import java.util.ArrayList;
import java.util.List;

public class Character {
    private String name;
    private int strength;
    private int dexterity;
    private int intelligence;

    private List<Skill> skills = new ArrayList<>();
    private List<Item> inventory = new ArrayList<>();

    public void setName(String name) { this.name = name; }
    public void setStrength(int strength) { this.strength = strength; }
    public void setDexterity(int dexterity) { this.dexterity = dexterity; }
    public void setIntelligence(int intelligence) { this.intelligence = intelligence; }

    public void addSkill(Skill skill) { skills.add(skill); }
    public void addItem(Item item) { inventory.add(item); }

    // --- Getters ---
    public String getName() { return name; }
    public int getStrength() { return strength; }
    public int getDexterity() { return dexterity; }
    public int getIntelligence() { return intelligence; }

    public List<Skill> getSkills() { return skills; }
    public List<Item> getInventory() { return inventory; }

    @Override
    public String toString() {
        return "Character: " + name +
                "\nStats: STR=" + strength + ", DEX=" + dexterity + ", INT=" + intelligence +
                "\nSkills: " + skills +
                "\nInventory: " + inventory;
    }
}
