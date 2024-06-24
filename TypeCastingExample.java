public class TypeCastingExample {
  public static void main(String[] args) {
      // Widening Casting (Implicit)
      int intValue = 100;
      long longValue = intValue;  // int to long
      float floatValue = longValue;  // long to float
      double doubleValue = floatValue;  // float to double

      // Print the values after widening casting
      System.out.println("Widening Casting:");
      System.out.println("int value: " + intValue);
      System.out.println("long value: " + longValue);
      System.out.println("float value: " + floatValue);
      System.out.println("double value: " + doubleValue);

      // Narrowing Casting (Explicit)
      double anotherDoubleValue = 9.78;
      float anotherFloatValue = (float) anotherDoubleValue;  // double to float
      long anotherLongValue = (long) anotherFloatValue;  // float to long
      int anotherIntValue = (int) anotherLongValue;  // long to int
      short anotherShortValue = (short) anotherIntValue;  // int to short
      byte anotherByteValue = (byte) anotherShortValue;  // short to byte

      // Print the values after narrowing casting
      System.out.println("\nNarrowing Casting:");
      System.out.println("double value: " + anotherDoubleValue);
      System.out.println("float value: " + anotherFloatValue);
      System.out.println("long value: " + anotherLongValue);
      System.out.println("int value: " + anotherIntValue);
      System.out.println("short value: " + anotherShortValue);
      System.out.println("byte value: " + anotherByteValue);
  }
}
