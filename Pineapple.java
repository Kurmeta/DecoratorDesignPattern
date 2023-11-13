// Declare the package for the class
package com.baeldung.decorator;

// Declare the class "Pineapple" which extends the abstract class "PizzaToppings"
public class Pineapple extends PizzaToppings {

    // Constructor for the "Pineapple" class, taking a "Pizza" object as a base
    public Pineapple(Pizza base) {
        // Call the constructor of the superclass "PizzaToppings" with the provided "Pizza" base
        super(base);
    }
    
    // Override the "toppings" method from the superclass
    public String toppings() {
        // Call the "toppings" method from the superclass and concatenate the result with the result of the "topWithPineapple" method
        return super.toppings() + topWithPineapple();
    }
    
    // Private method that returns a String indicating that the pizza is topped with pineapple
    private String topWithPineapple() {
        return " with Pineapple";
    }
}
