package Lec4_Creational_design_patterns.prototype_design;

import Lec4_Creational_design_patterns.prototype_design.src.Characters;

public class Main {
    public static void main(String[] args) {
        Characters originalCharacter = new Characters("Warrior", 100, 50, 30, 1);
        System.out.println("Original Character:");
        originalCharacter.displayCharacterInfo();

        // try {
        //     Characters clonedCharacter = (Characters) originalCharacter.clone();
        //     System.out.println("\nCloned Character:");
        //     clonedCharacter.displayCharacterInfo();
        // } catch (CloneNotSupportedException e) {
        //     e.printStackTrace();
        // }
    }
}
