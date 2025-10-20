package Lec4_Creational_design_patterns.abstract_design.src;

/*
 * @author Guddu Kumar Yadav
 * @version 1.0
 * @since 2024-06-12
 * This class represents a Modern Chair, which implements the Chair interface.
 * It provides a specific implementation for the sitOn method.
 */
public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a modern chair.");
    }
}
