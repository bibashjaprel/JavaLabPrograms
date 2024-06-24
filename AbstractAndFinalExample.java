// Abstract class example
abstract class Animal {
  // Abstract method (no implementation)
  public abstract void makeSound();

  // Concrete method
  public void eat() {
      System.out.println("Animal is eating");
  }
}

// Concrete subclass of Animal
class Dog extends Animal {
  // Implementing abstract method
  @Override
  public void makeSound() {
      System.out.println("Dog barks");
  }
}

// Another concrete subclass of Animal
class Cat extends Animal {
  // Implementing abstract method
  @Override
  public void makeSound() {
      System.out.println("Cat meows");
  }
}

// Class with final methods and variables
class Bicycle {
  // Final variable
  final String brand;

  // Constructor initializing final variable
  public Bicycle(String brand) {
      this.brand = brand;
  }

  // Final method that cannot be overridden
  public final void applyBrake() {
      System.out.println("Applying brake");
  }

  // Non-final method
  public void speedUp() {
      System.out.println("Speeding up");
  }
}

// Subclass of Bicycle
class MountainBike extends Bicycle {
  // Constructor calling super constructor with brand
  public MountainBike(String brand) {
      super(brand);
  }

  // Attempt to override final method (will cause compilation error)
//    @Override
//    public final void applyBrake() {
//        System.out.println("Applying brake on mountain bike");
//    }
}

// Main class to demonstrate abstract and final keywords
public class AbstractAndFinalExample {
  public static void main(String[] args) {
      // Creating instances of Dog and Cat
      Animal dog = new Dog();
      Animal cat = new Cat();

      // Calling methods
      dog.makeSound();
      cat.makeSound();
      dog.eat();
      cat.eat();

      // Creating instances of Bicycle and MountainBike
      Bicycle bike = new Bicycle("Giant");
      MountainBike mountainBike = new MountainBike("Trek");

      // Accessing final variable
      System.out.println("Bike brand: " + bike.brand);
      System.out.println("Mountain bike brand: " + mountainBike.brand);

      // Calling methods
      bike.applyBrake();
      bike.speedUp();

      mountainBike.applyBrake();
      mountainBike.speedUp();
  }
}
