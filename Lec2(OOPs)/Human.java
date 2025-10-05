public class Human {
    // Attributes (fields)
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static void main(String[] args) {
        // Lets understand about the deep copy and shallow copy
        Human h1 = new Human("Guddu", 24);
        Human h2 = new Human("Guddu", 24);
        Human h3 = h1; // Shallow Copy - Reference Copy : Both h1 and h3 point to the same object in memory
        System.out.println(h1 == h2); // false - Different objects in memory
        System.out.println(h1 == h3); // true - Same reference in memory
        
        // Modifying h3 will also affect h1
        h3.age = 25;
        System.out.println(h1.age); // 25
        System.out.println(h3.age); // 25


        // Modifying h2 will not affect h1
        h2.age = 30;
        System.out.println(h1.age); // 25
        System.out.println(h2.age); // 30
        

        // Deep Copy - Value Copy : Creating a new object with the same values
        Human h4 = new Human(h1.name, h1.age);
        System.out.println(h1 == h4); // false - Different objects in memory
        System.out.println(h1.name.equals(h4.name)); // true - Same values
        System.out.println(h1.age == h4.age); // true - Same values
    }
}
