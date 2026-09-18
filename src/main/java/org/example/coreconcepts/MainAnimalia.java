package org.example.coreconcepts;

class Animalia {

  public void animalSound() {

    System.out.println("The animal makes a sound");
  }
}

class Doggie extends Animalia {

  public void animalSound() {

    super.animalSound(); // Call the parent method

    System.out.println("The dog says: bow wow");
  }
}

public class MainAnimalia {

  public static void main(String[] args) {

    Doggie myDog = new Doggie();
    myDog.animalSound();

  }
}