package Lec4_Creational_design_patterns.prototype_design.src;


/**
 * @author Guddu Kumar Yadav
 * @created 20/10/2024 - 07:43 AM
 * @project LLD_Series
 * @description This class represents a character in the game with various attributes.  It implements the Cloneable interface to allow cloning of character instances.  
 */
public class Characters implements Cloneable {
    private String name;
    private int health;
    private int attackPower;
    private int defense;
    private int level;

    public Characters(String name, int health, int attackPower, int defense, int level) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.defense = defense;
        this.level = level;
    }

    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public int getAttackPower() {
        return attackPower;
    }
    public int getDefense() {
        return defense;
    }
    public int getLevel() {
        return level;
    }    

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone(); // Shallow copy
    }

    public void displayCharacterInfo() {
        System.out.println("Character Info:");
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " + attackPower);
        System.out.println("Defense: " + defense);
        System.out.println("Level: " + level);
    }
}

