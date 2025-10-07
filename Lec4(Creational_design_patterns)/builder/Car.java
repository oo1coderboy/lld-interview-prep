// Builder Design Pattern
public class Car {
    // Fields for the Car class
    private String engine;
    private int wheels;
    private int sheets;
    private String color;
    private boolean sunRoof;
    private boolean navigationSystem;


    // private constructor
    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.sheets = builder.sheets;
        this.color = builder.color;
        this.sunRoof = builder.sunRoof;
        this.navigationSystem = builder.navigationSystem;
    }

    // Getter methods for the fields
    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSheets() {
        return sheets;
    }

    public String getColor() {
        return color;
    }

    public boolean hasSunRoof() {
        return sunRoof;
    }

    public boolean hasNavigationSystem() {
        return navigationSystem;
    }
    @Override
    public String toString() {
        return "Car [" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", sheets=" + sheets +
                ", color='" + color + '\'' +
                ", sunRoof=" + sunRoof +
                ", navigationSystem=" + navigationSystem +
                ']';
    }

    // Static nested Builder class
    public static class CarBuilder {
        private String engine;
        private int wheels;
        private int sheets;
        private String color;
        private boolean sunRoof;
        private boolean navigationSystem;

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        
        public CarBuilder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public CarBuilder setSheets(int sheets) {
            this.sheets = sheets;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setSunRoof(boolean sunRoof) {
            this.sunRoof = sunRoof;
            return this;
        }

        public CarBuilder setNavigationSystem(boolean navigationSystem) {
            this.navigationSystem = navigationSystem;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
