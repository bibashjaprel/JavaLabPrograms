// Employee class (base class)
class Employee {
  protected double salary; // base salary

  // Constructor
  public Employee(double salary) {
      this.salary = salary;
  }

  // Method to calculate full salary
  public double getFullSalary() {
      return salary;
  }
}

// Director class (derived from Employee)
class Director extends Employee {
  private double bonus = 15000;

  // Constructor
  public Director(double salary) {
      super(salary);
  }

  // Method to calculate full salary including bonus
  @Override
  public double getFullSalary() {
      return salary + bonus;
  }
}

// Programmer class (derived from Employee)
class Programmer extends Employee {
  private double bonus = 10000;

  // Constructor
  public Programmer(double salary) {
      super(salary);
  }

  // Method to calculate full salary including bonus
  @Override
  public double getFullSalary() {
      return salary + bonus;
  }
}

// Main class to demonstrate the usage
public class Main {
  public static void main(String[] args) {
      // Creating instances of Director and Programmer
      Director director = new Director(80000); // Assuming base salary for Director
      Programmer programmer = new Programmer(60000); // Assuming base salary for Programmer

      // Displaying full salary of Director
      System.out.println("Full salary of Director: $" + director.getFullSalary());

      // Displaying full salary of Programmer
      System.out.println("Full salary of Programmer: $" + programmer.getFullSalary());
  }
}
