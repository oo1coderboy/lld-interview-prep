
public class CarTest {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder("2024", "Tesla", "Model S")
                .setColor("Red")
                .setSunroof(true)
                .setGPS(true)
                .build();

        System.out.println(car);
    }
}
