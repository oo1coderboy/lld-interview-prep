
/**
 * @author Guddu Kumar Yadav
 * @version 1.0
 * @since 2024-06-12
 * This class is a test class for the Car class and demonstrates the usage of the Builder design pattern.
 * It creates a Car object using the CarBuilder and prints its details.
 */
public class CarTest {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .setEngine("V8")
                .setWheels(4)
                .setSheets(5)
                .setColor("Red")
                .setSunRoof(true)
                .setNavigationSystem(true)
                .build();

        System.out.println(car);
    }
}
