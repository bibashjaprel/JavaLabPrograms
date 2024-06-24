// Employee class
class Employee {
  private String name;
  private double salary;

  // Constructor
  public Employee(String name, double salary) {
      this.name = name;
      this.salary = salary;
  }

  // Getters
  public String getName() {
      return name;
  }

  public double getSalary() {
      return salary;
  }
}

// Department class (aggregation)
class Department {
  private String name;
  private Employee[] employees; // Array to hold employees
  private int size; // Current number of employees

  // Constructor
  public Department(String name, int capacity) {
      this.name = name;
      this.employees = new Employee[capacity];
      this.size = 0; // Initially no employees
  }

  // Method to add an employee
  public void addEmployee(Employee emp) {
      if (size < employees.length) {
          employees[size] = emp;
          size++;
      } else {
          System.out.println("Department is full. Cannot add more employees.");
      }
  }

  // Method to display all employees in the department
  public void displayEmployees() {
      System.out.println("Employees in " + name + " department:");
      for (int i = 0; i < size; i++) {
          System.out.println("Name: " + employees[i].getName() + ", Salary: $" + employees[i].getSalary());
      }
  }
}

// AggregationDemo class to demonstrate aggregation
public class AggregationDemo {
  public static void main(String[] args) {
      // Create some Employee objects
      Employee emp1 = new Employee("John Doe", 50000);
      Employee emp2 = new Employee("Jane Smith", 60000);
      Employee emp3 = new Employee("Mike Wilson", 55000);

      // Create a Department and add employees
      Department dept = new Department("Engineering", 10);
      dept.addEmployee(emp1);
      dept.addEmployee(emp2);
      dept.addEmployee(emp3);

      // Display all employees in the department
      dept.displayEmployees();
  }
}
