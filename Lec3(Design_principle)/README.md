# 🧠 SOLID Principles in Java

- This document explains the **SOLID principles** of Object-Oriented Design with examples in **Java**.
---

## 🧠 What is SOLID?

- SOLID is an acronym for five core design principles that make your code:
   - Scalable
   - Maintainable
   - Reusable
   - Easy to understand and extend

- It was introduced by Robert C. Martin (Uncle Bob) and is the foundation of good object-oriented design.
---

## 🧱 1. S – Single Responsibility Principle (SRP)

### Definition:
- A class should have only one reason to change, meaning it should have only one responsibility or job.

- ✅ Goal: Reduce coupling and increase cohesion.

### ❌ Bad Example
```java
class Report {
    public void generateReport() {
        // Logic to generate report
    }

    public void saveToFile() {
        // Logic to save report to a file
    }
}
```

- 👉 This class handles two responsibilities — report generation and file saving.

### ✅ Good Example
```java
class ReportGenerator {
    public void generateReport() {
        // Generate report
    }
}

class ReportSaver {
    public void saveToFile() {
        // Save to file
    }
}
```

- Now, each class has one clear purpose.
---

## 🧱 2. O – Open/Closed Principle (OCP)

### Definition:
- Software entities (classes, modules, functions) should be open for extension, but closed for modification.

- ✅ Goal: Add new features without changing existing code.

### ❌ Bad Example
```java
class AreaCalculator {
    public double calculateArea(Object shape) {
        if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            return Math.PI * c.radius * c.radius;
        } else if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            return r.length * r.breadth;
        }
        return 0;
    }
}
```

- 👉 Every time you add a new shape, you must modify this class → violates OCP.

### ✅ Good Example
```java
interface Shape {
    double area();
}

class Circle implements Shape {
    double radius;
    Circle(double radius) { this.radius = radius; }
    public double area() { return Math.PI * radius * radius; }
}

class Rectangle implements Shape {
    double length, breadth;
    Rectangle(double l, double b) { this.length = l; this.breadth = b; }
    public double area() { return length * breadth; }
}

class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.area();
    }
}

```
- Now, you can extend the system by adding new Shape implementations — no need to modify existing code.
---
## 🧱 3. L – Liskov Substitution Principle (LSP)

### Definition:
- Objects of a superclass should be replaceable with objects of its subclasses without breaking the system.

- ✅ Goal: Maintain correct behavior when using inheritance.

### ❌ Bad Example
```java
class Bird {
    void fly() { System.out.println("Flying"); }
}

class Ostrich extends Bird {
    void fly() {
        throw new UnsupportedOperationException("Ostrich can't fly");
    }
}
```

- 👉 Violates LSP — Ostrich can’t behave like a normal Bird.

### ✅ Good Example
```java
interface Bird {
    void eat();
}

interface FlyingBird extends Bird {
    void fly();
}

class Sparrow implements FlyingBird {
    public void eat() { System.out.println("Eating"); }
    public void fly() { System.out.println("Flying"); }
}

class Ostrich implements Bird {
    public void eat() { System.out.println("Eating"); }
}
```

- ✅ The design separates behavior properly — substitution works fine.
---
## 🧱 4. I – Interface Segregation Principle (ISP)

### Definition:
- A client should not be forced to depend on methods it does not use.

- ✅ Goal: Prefer small, focused interfaces over large, general-purpose ones.

### ❌ Bad Example
```java
interface Worker {
    void work();
    void eat();
}

class Robot implements Worker {
    public void work() {}
    public void eat() {} // Robot doesn’t eat → violates ISP
}

✅ Good Example
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Human implements Workable, Eatable {
    public void work() {}
    public void eat() {}
}

class Robot implements Workable {
    public void work() {}
}
```

- ✅ Each class implements only what it actually needs.
---
## 🧱 5. D – Dependency Inversion Principle (DIP)

### Definition:
- High-level modules should not depend on low-level modules.
Both should depend on abstractions (interfaces).

- ✅ Goal: Reduce coupling and improve testability.

### ❌ Bad Example
```java
class LightBulb {
    public void turnOn() { System.out.println("Bulb on"); }
    public void turnOff() { System.out.println("Bulb off"); }
}

class Switch {
    private LightBulb bulb = new LightBulb();
    public void operate(boolean on) {
        if (on) bulb.turnOn(); else bulb.turnOff();
    }
}
```

- 👉 Tight coupling — Switch is directly dependent on LightBulb.

### ✅ Good Example
```java
interface Switchable {
    void turnOn();
    void turnOff();
}

class LightBulb implements Switchable {
    public void turnOn() { System.out.println("Bulb on"); }
    public void turnOff() { System.out.println("Bulb off"); }
}

class Switch {
    private Switchable device;
    Switch(Switchable device) { this.device = device; }

    public void operate(boolean on) {
        if (on) device.turnOn(); else device.turnOff();
    }
}
```

- ✅ Now Switch depends on an abstraction → can work with any Switchable device (Fan, AC, etc.).
---
## 🧾 Summary Notes
| Principle	| Meaning |	Benefit |
------------|---------|---------|
| S – Single Responsibility | One class = one job |	Easier maintenance |
| O – Open/Closed |	Open for extension, closed for modification	|Add features safely |
| L – Liskov Substitution |	Subclasses must behave like parents	|Robust inheritance |
| I – Interface Segregation |	No unnecessary methods |	Cleaner, smaller interfaces |
| D – Dependency Inversion |	Depend on abstractions, not details	 | Loose coupling |

---
- ✅ Key Takeaways

    - SOLID principles make your code flexible, testable, and scalable.
    - Always design for change — avoid rigid dependencies.
    - These principles are interconnected — following one often reinforces others.
    - Use them in your LLD interviews to justify your design choices.
---
**Author:** `Guddu Kumar Yadav` \
**Category:** System Design / LLD Interview Preparation \
**Last Updated:** October 2025  