public class ControlFlowExamples {

  public static void main(String[] args) {
      // Example of break
      System.out.println("Example of break:");
      for (int i = 1; i <= 5; i++) {
          if (i == 3) {
              break; // Exit the loop when i is 3
          }
          System.out.println(i);
      }
      System.out.println(); // Blank line for separation

      // Example of continue
      System.out.println("Example of continue:");
      for (int i = 1; i <= 5; i++) {
          if (i == 3) {
              continue; // Skip the iteration when i is 3
          }
          System.out.println(i);
      }
      System.out.println(); // Blank line for separation

      // Example of return (in a method)
      System.out.println("Example of return:");
      int result = calculateSum(5, 3);
      System.out.println("Sum: " + result);
      System.out.println(); // Blank line for separation

      // Example of System.exit(0)
      System.out.println("Example of System.exit(0):");
      for (int i = 1; i <= 5; i++) {
          System.out.println(i);
          if (i == 3) {
              System.exit(0); // Terminate the program when i is 3
          }
      }
  }

  // Method demonstrating return statement
  public static int calculateSum(int a, int b) {
      int sum = a + b;
      return sum; // Returns the sum to the caller
  }
}
