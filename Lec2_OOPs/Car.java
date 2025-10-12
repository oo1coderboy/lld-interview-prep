public class Car {
    // Attributes (fields)
    String color;
    String model;
    String year;
    int speed;
    double fuelLevel;
    boolean isEngineOn;


    // Constructor
    public Car(String color, String model, String year, int speed, double fuelLevel, boolean isEngineOn) {
        this.color = color;
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.fuelLevel = fuelLevel;
        this.isEngineOn = isEngineOn;
    }

    // Methods (behaviors)
    public void startEngine() {
        if(!isEngineOn) {
            isEngineOn = true;
            System.out.println("Starting the engine....");
        } else {
            System.out.println("Engine is already on.");
        }
    }

    public void stopEngine() {
        if(isEngineOn) {
            isEngineOn = false;
            speed = 0; // Car stops when engine is off
            System.out.println("Stopping the engine....");
        } else {
            System.out.println("Engine is already off.");
        }
    }
    
    public void accelerate(int increment) {
        if(isEngineOn) {
            speed += increment;
            fuelLevel -= increment * 0.5; // consume fuel
            System.out.println("Accelerating... New Speed: " + speed + " km/h");
        } else {
            System.out.println("Can't accelerate. The engine is off.");
        }
    }

    public void brake(int decrement) {
        if(speed > 0) {
            speed -= decrement;
            if(speed < 0) speed = 0; // Speed can't be negative
            System.out.println("Braking... New Speed: " + speed + " km/h");
        } else {
            System.out.println("The car is already stopped.");
        }
    }

    public void refuel(double amount) {
        fuelLevel += amount;
        System.out.println("Refueling... New Fuel Level: " + fuelLevel + " liters");
    }

    public void displayStatus() {
        System.out.println("Car Status:");
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Level: " + fuelLevel + " liters");
        System.out.println("Engine On: " + isEngineOn);
    }


    public static void main(String[] args) {
        Car myCar = new Car("Red", "Toyota", "2020", 0, 50.0, false);
        myCar.displayStatus();
        myCar.startEngine();
        myCar.accelerate(30);
        myCar.brake(10);
        myCar.refuel(20);
        myCar.stopEngine();
        myCar.displayStatus();
    }

}
