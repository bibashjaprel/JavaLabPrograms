public class MultiplicationTable {
  public static void main(String[] args) {
      // Define the range of numbers for multiplication tables
      int start = 1;
      int end = 20;
      int tableSize = 10;

      // Iterate through each number in the range
      for (int i = start; i <= end; i++) {
          System.out.println("Multiplication table for " + i + ":");
          System.out.println("--------------------------");

          // Initialize an array to store the results of multiplication
          int[] table = new int[tableSize];

          // Populate the array with multiplication results
          for (int j = 1; j <= tableSize; j++) {
              table[j-1] = i * j;
          }

          // Print the multiplication table
          for (int j = 1; j <= tableSize; j++) {
              System.out.println(i + " x " + j + " = " + table[j-1]);
          }

          System.out.println(); // Empty line for separation
      }
  }
}
