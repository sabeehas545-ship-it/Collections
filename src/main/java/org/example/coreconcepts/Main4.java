package org.example.coreconcepts;

public class Main4 {
  int modelYear;
  String modelName;

  // Constructor with one parameter
  public Main4(String modelName) {
    // Call the two-parameter constructor to reuse code and set a default year    
    this(2020, modelName);
  }

  // Constructor with two parameters
  public Main4(int modelYear, String modelName) {
    // Use 'this' to assign values to the class variables
    this.modelYear = modelYear;
    this.modelName = modelName;
  }

  // Method to print car information
  public void printInfo() {
    System.out.println(modelYear + " " + modelName);
  }

  public static void main(String[] args) {
    // Create a car with only model name (uses default year)
    Main4 car1 = new Main4("Corvette");

    // Create a car with both model year and name
    Main4 car2 = new Main4(1969, "Mustang");

    car1.printInfo();
    car2.printInfo();
  }
}