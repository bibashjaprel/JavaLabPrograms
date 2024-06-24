// Outer class
class OuterClass {
  private int outerField = 10;

  // Nested class
  static class NestedStaticClass {
      void display() {
          System.out.println("Nested static class method");
          // Outer class fields cannot be accessed directly in a static nested class
          // Uncommenting the line below will cause compilation error
          // System.out.println("Outer field from nested static class: " + outerField);
      }
  }

  // Inner class
  class InnerClass {
      void display() {
          System.out.println("Inner class method");
          // Inner classes can access outer class fields directly
          System.out.println("Outer field from inner class: " + outerField);
      }
  }

  // Method in outer class
  void outerMethod() {
      System.out.println("Outer method");
      
      // Local class inside method
      class LocalClass {
          void display() {
              System.out.println("Local class method");
              System.out.println("Outer field from local class: " + outerField);
          }
      }

      // Creating object of local class and calling method
      LocalClass local = new LocalClass();
      local.display();
  }
}

// Main class to demonstrate nested and inner classes
public class NestedInnerClassExample {
  public static void main(String[] args) {
      // Accessing nested static class
      OuterClass.NestedStaticClass nestedStatic = new OuterClass.NestedStaticClass();
      nestedStatic.display();

      // Creating instance of outer class
      OuterClass outer = new OuterClass();

      // Accessing inner class using outer class instance
      OuterClass.InnerClass inner = outer.new InnerClass();
      inner.display();

      // Calling outer method which uses a local class
      outer.outerMethod();
  }
}
