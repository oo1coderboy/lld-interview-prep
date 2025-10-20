package Lec4_Creational_design_patterns.abstract_design.src;

/*
 * @author Guddu Kumar Yadav
 * @version 1.0
 * @since 2024-06-12
 * This class represents a Modern Sofa and implements the Sofa interface.
 * It provides a specific implementation for the lieOn method.
 */
public class ModernSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on a modern sofa.");
    }
    
}
