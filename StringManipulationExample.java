public class StringManipulationExample {

  public static void main(String[] args) {
      // String manipulation methods
      stringManipulationMethods();

      // StringBuffer manipulation methods
      stringBufferManipulationMethods();
  }

  // Demonstrates various String manipulation methods
  public static void stringManipulationMethods() {
      // Initialization
      String str1 = "Hello";
      String str2 = "Java";
      String str3 = "Hello";
      String str4 = "HELLO";

      // Length of the string
      System.out.println("Length of str1: " + str1.length());

      // Concatenation
      String concatStr = str1.concat(" ").concat(str2);
      System.out.println("Concatenated string: " + concatStr);

      // Compare strings
      System.out.println("Comparison (str1.equals(str3)): " + str1.equals(str3)); // true
      System.out.println("Comparison (str1.equals(str4)): " + str1.equals(str4)); // false
      System.out.println("Comparison (str1.equalsIgnoreCase(str4)): " + str1.equalsIgnoreCase(str4)); // true

      // Substring extraction
      String substring = str1.substring(2); // Start from index 2
      System.out.println("Substring from index 2: " + substring);

      // Searching
      System.out.println("Index of 'e' in str1: " + str1.indexOf('e')); // 1
      System.out.println("Last index of 'l' in str1: " + str1.lastIndexOf('l')); // 3

      // Replace
      String replacedStr = str1.replace('l', 'L');
      System.out.println("After replacement: " + replacedStr);

      // Convert to uppercase and lowercase
      System.out.println("Uppercase: " + str1.toUpperCase());
      System.out.println("Lowercase: " + str1.toLowerCase());

      // Trim
      String str5 = "  Hello   ";
      System.out.println("Trimmed string: " + str5.trim());
  }

  // Demonstrates various StringBuffer manipulation methods
  public static void stringBufferManipulationMethods() {
      // Initialization
      StringBuffer buffer = new StringBuffer("Hello");

      // Append
      buffer.append(" Java");
      System.out.println("Appended StringBuffer: " + buffer);

      // Insert
      buffer.insert(5, " World");
      System.out.println("Inserted StringBuffer: " + buffer);

      // Replace
      buffer.replace(11, 16, "!");
      System.out.println("Replaced StringBuffer: " + buffer);

      // Delete
      buffer.delete(5, 11);
      System.out.println("Deleted StringBuffer: " + buffer);

      // Reverse
      buffer.reverse();
      System.out.println("Reversed StringBuffer: " + buffer);
  }
}
