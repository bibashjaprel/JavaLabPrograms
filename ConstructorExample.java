// Class with default and parameterized constructors
class MyClass {
  private int value;

  // Default constructor (no arguments)
  public MyClass() {
      this.value = 0; // Initialize value to 0
  }

  // Parameterized constructor with one parameter
  public MyClass(int value) {
      this.value = value; // Initialize value to the provided parameter
  }

  // Getter method to access the private variable
  public int getValue() {
      return this.value;
  }
}

public class ConstructorExample {
  public static void main(String[] args) {
      // Creating objects using both constructors
      MyClass obj1 = new MyClass(); // Default constructor
      MyClass obj2 = new MyClass(10); // Parameterized constructor

      // Displaying values using getter method
      System.out.println("Value of obj1 (default constructor): " + obj1.getValue());
      System.out.println("Value of obj2 (parameterized constructor): " + obj2.getValue());
  }
}
