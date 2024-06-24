// Parent class
class Animal {
  void eat() {
      System.out.println("Animal is eating");
  }
}

// Single Inheritance: Dog inherits from Animal
class Dog extends Animal {
  void bark() {
      System.out.println("Dog is barking");
  }
}

// Multilevel Inheritance: Puppy inherits from Dog
class Puppy extends Dog {
  void wagTail() {
      System.out.println("Puppy is wagging tail");
  }
}

// Hierarchical Inheritance: Cat and Tiger inherit from Animal
class Cat extends Animal {
  void meow() {
      System.out.println("Cat is meowing");
  }
}

class Tiger extends Animal {
  void roar() {
      System.out.println("Tiger is roaring");
  }
}

// Interface for Multiple Inheritance example
interface Swim {
  void swim();
}

interface Run {
  void run();
}

// Class implementing multiple interfaces
class Duck implements Swim, Run {
  @Override
  public void swim() {
      System.out.println("Duck is swimming");
  }

  @Override
  public void run() {
      System.out.println("Duck is running");
  }
}

// Main class to demonstrate different types of inheritance
public class InheritanceExample {
  public static void main(String[] args) {
      // Single Inheritance
      Dog dog = new Dog();
      dog.eat();
      dog.bark();
      System.out.println();

      // Multilevel Inheritance
      Puppy puppy = new Puppy();
      puppy.eat();
      puppy.bark();
      puppy.wagTail();
      System.out.println();

      // Hierarchical Inheritance
      Cat cat = new Cat();
      cat.eat();
      cat.meow();

      Tiger tiger = new Tiger();
      tiger.eat();
      tiger.roar();
      System.out.println();

      // Multiple Inheritance through interfaces
      Duck duck = new Duck();
      duck.swim();
      duck.run();
  }
}
