package Lec4_Creational_design_patterns.factoryDesign;
/**
 * 
 * @author Guddu Kumar Yadav
 * @version 1.0
 * @since 2024-06-12
 * This class represents a Truck, which is a type of Vehicle.
 * It implements the Vehicle interface and provides specific implementations for starting and stopping the truck.
 * @Project Design-Patterns-in-Java
 */
public class Truck implements Vehicle {

    public void stop() {
        System.out.println("Truck is stopping....");
    }

    public void start() {
        System.out.println("Truck is starting....");
    }
}
