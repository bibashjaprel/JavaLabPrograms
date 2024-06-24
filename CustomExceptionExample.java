// CustomException class (custom/user defined exception)
class CustomException extends Exception {
  // Constructor with a message
  public CustomException(String message) {
      super(message);
  }
}

// Main class to demonstrate custom exception
public class CustomExceptionExample {
  // Method that simulates a scenario throwing the custom exception
  public static void validateAge(int age) throws CustomException {
      if (age < 18) {
          throw new CustomException("Age must be 18 or above.");
      } else {
          System.out.println("Valid age: " + age);
      }
  }

  public static void main(String[] args) {
      try {
          // Calling a method that may throw our custom exception
          validateAge(15); // Trying with an invalid age
      } catch (CustomException e) {
          // Catching and handling the custom exception
          System.out.println("Custom Exception Caught: " + e.getMessage());
      }
  }
}
