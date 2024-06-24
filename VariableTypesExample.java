public class VariableTypesExample {
  // Static variable
  static int staticVariable = 10;

  // Instance variable
  int instanceVariable = 20;

  public void demonstrateVariables() {
      // Local variable
      int localVariable = 30;

      // Print all variables
      System.out.println("Static variable: " + staticVariable);
      System.out.println("Instance variable: " + instanceVariable);
      System.out.println("Local variable: " + localVariable);
  }

  public static void main(String[] args) {
      // Create an object of VariableTypesExample
      VariableTypesExample example = new VariableTypesExample();

      // Call the method to demonstrate variables
      example.demonstrateVariables();

      // Accessing static variable directly using the class name
      System.out.println("Accessing static variable directly: " + VariableTypesExample.staticVariable);
  }
}
