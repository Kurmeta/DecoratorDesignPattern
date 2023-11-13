// Declare the package for the class
package com.baeldung.decorator;

// Declare the abstract class "PizzaToppings" which implements the "Pizza" interface
public abstract class PizzaToppings implements Pizza {

    // Declare a private field to store the base pizza
    private Pizza base;
    
    // Constructor for the "PizzaToppings" class, taking a "Pizza" object as a base
    public PizzaToppings(Pizza base) {
        // Initialize the base pizza
        this.base = base;
    }
    
    // Implement the "Toppings" method from the "Pizza" interface
    @Override
    public String Toppings() {
        // Delegate the call to the "Toppings" method of the base pizza
        return base.Toppings();
    }
}
