package org.example.coreconcepts;

// Interface
interface Animala {

  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pigi implements Animala {

  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzz");
  }
}

class Maine {

  public static void main(String[] args) {

    Pigi myPig = new Pigi();  // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}