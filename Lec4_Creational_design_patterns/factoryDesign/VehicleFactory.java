package Lec4_Creational_design_patterns.factoryDesign;

/**
 * 
 * @author Guddu Kumar Yadav
 * @version 1.0
 * @since 2024-06-12
 * This class is a Factory that generates different types of Vehicle objects based on the input type.
 * It uses the Factory Design Pattern to encapsulate the object creation logic.
 * @Project Design-Patterns-in-Java
 */

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType) {
        if(vehicleType == null) {
            return null;
        }
        switch (vehicleType.toLowerCase()) {
            case "car":
                return new Car();               

            case "bike":
                return new Bike();

            case "truck":
                return new Truck();
    
            default:
                return null;
        }
    }
}
