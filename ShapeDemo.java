// Abstraction: Shape is an abstract concept with specific behaviors
abstract class Shape {
  // Encapsulated fields
  private String color;
  private boolean filled;

  // Constructor
  public Shape(String color, boolean filled) {
      this.color = color;
      this.filled = filled;
  }

  // Abstract method to get area (specific to each shape)
  public abstract double getArea();

  // Abstract method to get perimeter (specific to each shape)
  public abstract double getPerimeter();

  // Getter and setter methods for encapsulated fields
  public String getColor() {
      return color;
  }

  public void setColor(String color) {
      this.color = color;
  }

  public boolean isFilled() {
      return filled;
  }

  public void setFilled(boolean filled) {
      this.filled = filled;
  }

  // Overridden toString method to describe the shape
  @Override
  public String toString() {
      return "Shape{" +
              "color='" + color + '\'' +
              ", filled=" + filled +
              '}';
  }
}

// Concrete class Circle extending Shape
class Circle extends Shape {
  private double radius;

  public Circle(String color, boolean filled, double radius) {
      super(color, filled);
      this.radius = radius;
  }

  @Override
  public double getArea() {
      return Math.PI * radius * radius;
  }

  @Override
  public double getPerimeter() {
      return 2 * Math.PI * radius;
  }

  @Override
  public String toString() {
      return "Circle{" +
              "radius=" + radius +
              ", " + super.toString() +
              '}';
  }
}

// Concrete class Rectangle extending Shape
class Rectangle extends Shape {
  private double width;
  private double height;

  public Rectangle(String color, boolean filled, double width, double height) {
      super(color, filled);
      this.width = width;
      this.height = height;
  }

  @Override
  public double getArea() {
      return width * height;
  }

  @Override
  public double getPerimeter() {
      return 2 * (width + height);
  }

  @Override
  public String toString() {
      return "Rectangle{" +
              "width=" + width +
              ", height=" + height +
              ", " + super.toString() +
              '}';
  }
}

// ShapeDemo class to demonstrate abstraction and encapsulation
public class ShapeDemo {
  public static void main(String[] args) {
      // Creating instances of Circle and Rectangle
      Circle circle = new Circle("Red", true, 5.0);
      Rectangle rectangle = new Rectangle("Blue", false, 4.0, 6.0);

      // Displaying details using abstraction
      System.out.println("Circle:");
      System.out.println("Area: " + circle.getArea());
      System.out.println("Perimeter: " + circle.getPerimeter());
      System.out.println(circle.toString());
      System.out.println();

      System.out.println("Rectangle:");
      System.out.println("Area: " + rectangle.getArea());
      System.out.println("Perimeter: " + rectangle.getPerimeter());
      System.out.println(rectangle.toString());
      System.out.println();

      // Demonstrating encapsulation by modifying color and filled status
      circle.setColor("Green");
      circle.setFilled(false);
      rectangle.setColor("Yellow");
      rectangle.setFilled(true);

      // Displaying modified details
      System.out.println("Updated Circle:");
      System.out.println(circle.toString());
      System.out.println();

      System.out.println("Updated Rectangle:");
      System.out.println(rectangle.toString());
  }
}
