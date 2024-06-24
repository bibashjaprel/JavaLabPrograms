import java.util.Scanner;

public class PrimitiveDataTypesInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a byte value
        System.out.print("Enter a byte value: ");
        byte byteValue = scanner.nextByte();

        // Read a short value
        System.out.print("Enter a short value: ");
        short shortValue = scanner.nextShort();

        // Read an int value
        System.out.print("Enter an int value: ");
        int intValue = scanner.nextInt();

        // Read a long value
        System.out.print("Enter a long value: ");
        long longValue = scanner.nextLong();

        // Read a float value
        System.out.print("Enter a float value: ");
        float floatValue = scanner.nextFloat();

        // Read a double value
        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble();

        // Read a char value
        System.out.print("Enter a char value: ");
        char charValue = scanner.next().charAt(0);

        // Read a boolean value
        System.out.print("Enter a boolean value: ");
        boolean booleanValue = scanner.nextBoolean();

        // Display the values
        System.out.println("You entered the following values:");
        System.out.println("Byte value: " + byteValue);
        System.out.println("Short value: " + shortValue);
        System.out.println("Int value: " + intValue);
        System.out.println("Long value: " + longValue);
        System.out.println("Float value: " + floatValue);
        System.out.println("Double value: " + doubleValue);
        System.out.println("Char value: " + charValue);
        System.out.println("Boolean value: " + booleanValue);
    }
}
