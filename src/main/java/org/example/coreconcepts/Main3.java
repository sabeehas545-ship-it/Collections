package org.example.coreconcepts;

public class Main3 {
  int x;  // Class variable x

  // Constructor with one parameter x
  public Main3(int x) {

    this.x = x; // refers to the class variable x
  }

  public static void main(String[] args) {

    // Create an object of Main and pass the value 5 to the constructor
    Main3 myObj = new Main3(5);
    System.out.println("Value of x = " + myObj.x);

  }
}