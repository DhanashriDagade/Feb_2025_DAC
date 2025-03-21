// Abstract class Shape
abstract class Shape {
    protected String shapeName; // Protected attribute for shape name

    // Constructor to initialize shapeName
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    // Getter method to return shape name
    public String getShapeName() {
        return shapeName;
    }

    // Abstract method to calculate area (to be implemented by subclasses)
    public abstract double calculateArea();
}

// Concrete class Circle extending Shape
class Circle extends Shape {
    private double radius; // Private attribute for encapsulation

    // Constructor to initialize radius
    public Circle(double radius) {
        super("Circle"); // Calling superclass constructor
        this.radius = radius;
    }

    // Overriding calculateArea method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Area formula: πr²
    }
}

// Concrete class Rectangle extending Shape
class Rectangle extends Shape {
    private double length, width; // Private attributes for encapsulation

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        super("Rectangle"); // Calling superclass constructor
        this.length = length;
        this.width = width;
    }

    // Overriding calculateArea method
    @Override
    public double calculateArea() {
        return length * width; // Area formula: length × width
    }
}

// Main class to test the program
public class ShapeTest {
    public static void main(String[] args) {
        // Using polymorphism: Shape reference holding a Circle object
        Shape circle = new Circle(5.0);
        System.out.println("Shape: " + circle.getShapeName());
        System.out.println("Area: " + circle.calculateArea());

        // Using polymorphism: Shape reference holding a Rectangle object
        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println("\nShape: " + rectangle.getShapeName());
        System.out.println("Area: " + rectangle.calculateArea());
    }
}
