// Declare the package for the class
package com.baeldung.decorator;

// Declare the class "Ham" which extends the abstract class "PizzaToppings"
public class Ham extends PizzaToppings {

    // Constructor for the "Ham" class, taking a "Pizza" object as a base
    public Ham(Pizza base) {
        // Call the constructor of the superclass "PizzaToppings" with the provided "Pizza" base
        super(base);
    }
    
    // Override the "toppings" method from the superclass
    public String toppings() {
        // Call the "toppings" method from the superclass and concatenate the result with the result of the "topWithHam" method
        return super.toppings() + topWithHam();
    }

    // Private method that returns a String indicating that the pizza is topped with ham
    private String topWithHam() {
        return " with Ham";
    }
}
