
public class Person {
    // Attributes (fields)
    String name;
    int age;
    String gender;

    // Constructor
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Methods (behaviors)
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    public void greet(Person p) {
        System.out.println("Hello " + p.name + ", Good to see you!");
    }

    public void introduce() {
        greet(this);
        System.out.println("I am " + age + " years old and I identify as " + gender + ".");
    }


    public static void main(String[] args) {
        Person alice = new Person("Alice", 30, "Female");
        alice.displayInfo();
        alice.introduce();
        Person bob = new Person("Bob", 25, "Male");
        bob.displayInfo();
        bob.introduce();
    }

}    
