// Declare the package for the class
package com.baeldung.decorator;

// Declare the class "Sweetcorn" which extends the abstract class "PizzaToppings"
public class Sweetcorn extends PizzaToppings {

    // Constructor for the "Sweetcorn" class, taking a "Pizza" object as a base
    public Sweetcorn(Pizza base) {
        // Call the constructor of the superclass "PizzaToppings" with the provided "Pizza" base
        super(base);
    }
    
    // Override the "toppings" method from the superclass
    public String toppings() {
        // Call the "toppings" method from the superclass and concatenate the result with the result of the "topWithSweetcorn" method
        return super.toppings() + topWithSweetcorn();
    }

    // Private method that returns a String indicating that the pizza is topped with sweetcorn
    private String topWithSweetcorn() {
        return " with Sweetcorn";
    }
}
