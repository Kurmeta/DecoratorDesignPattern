// Declare the package for the class
package com.baeldung.decorator;

// Declare the class "Pepperoni" which extends the abstract class "PizzaToppings"
public class Pepperoni extends PizzaToppings {

    // Constructor for the "Pepperoni" class, taking a "Pizza" object as a base
    public Pepperoni(Pizza base) {
        // Call the constructor of the superclass "PizzaToppings" with the provided "Pizza" base
        super(base);
    }
    
    // Override the "toppings" method from the superclass
    public String toppings() {
        // Call the "toppings" method from the superclass and concatenate the result with the result of the "topWithPepperoni" method
        return super.toppings() + topWithPepperoni();
    }

    // Private method that returns a String indicating that the pizza is topped with pepperoni
    private String topWithPepperoni() {
        return " with Pepperoni";
    }
}
