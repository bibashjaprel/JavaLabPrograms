// Parent class
class Animal {
  // Method to make sound
  public void makeSound() {
      System.out.println("Animal makes a sound");
  }
}

// Child class 1
class Dog extends Animal {
  // Override method to make sound
  @Override
  public void makeSound() {
      System.out.println("Dog barks");
  }
}

// Child class 2
class Cat extends Animal {
  // Override method to make sound
  @Override
  public void makeSound() {
      System.out.println("Cat meows");
  }
}

// Main class to demonstrate dynamic method dispatch
public class DynamicDispatchExample {
  public static void main(String[] args) {
      // Reference variable of type Animal referring to a Dog object
      Animal myPet = new Dog();
      
      // Call makeSound method - Dynamic method dispatch occurs here
      myPet.makeSound(); // Output will be "Dog barks"
      
      // Change reference to a Cat object
      myPet = new Cat();
      
      // Call makeSound method again - Dynamic method dispatch occurs again
      myPet.makeSound(); // Output will be "Cat meows"
  }
}
