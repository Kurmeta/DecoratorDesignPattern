// Declare the package for the class
package com.baeldung.decorator;

// Declare the class "PizzaImpl" which implements the "Pizza" interface
public class PizzaImpl implements Pizza {

    // Implement the "Toppings" method from the "Pizza" interface
    @Override
    public String Toppings() {
        // Return a string indicating basic pizza toppings
        return "Pizza";
    }
}

