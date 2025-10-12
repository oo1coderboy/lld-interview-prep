package Lec4_Creational_design_patterns.factoryDesign;
/**
 * @author Guddu Kumar Yadav
 * @version 1.0
 * @since 2024-06-12
 * This interface represents a Vehicle with basic operations to start and stop.
 * It is implemented by various vehicle types like Car, Bike, and Truck.
 */
public interface Vehicle {
    void stop();
    void start();
}
