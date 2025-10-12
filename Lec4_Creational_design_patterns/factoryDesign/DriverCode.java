package Lec4_Creational_design_patterns.factoryDesign;

/**
 * 
 * @author Guddu Kumar Yadav
 * @version 1.0
 * @since 2024-06-12
 * This class demonstrates the use of the Factory Design Pattern to create different types of vehicles.
 * @Project Design-Patterns-in-Java
 */

public class DriverCode {
    public static void main(String[] args) {
        Vehicle truckVehicle = VehicleFactory.getVehicle("Truck");
        truckVehicle.start();
        truckVehicle.stop();

        // Creating another vehicle instance
        Vehicle carVehicle = VehicleFactory.getVehicle("Car");
        carVehicle.start();
        carVehicle.stop();
    }
}
