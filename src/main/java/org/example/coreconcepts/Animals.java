package org.example.coreconcepts;

// Abstract class
abstract class Animals {

  // Abstract method (does not have a body)
  public abstract void animalSound();

  // Regular method
  public void sleep() {

    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Pigs extends Animals {

 public void animalSound() {

    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");

  }
}

class Mains {

  public static void main(String[] args) {

    Pigs myPig = new Pigs(); // Create a Pig object

    myPig.animalSound();

    myPig.sleep();
  }
}