public class GenderDisplay {
  public static void main(String[] args) {
      boolean isMale = true; // Change to false to display "Female"

      // Using ternary operator to display gender
      String gender = (isMale) ? "Male" : "Female";

      System.out.println("Gender: " + gender);
  }
}
