// Declare the package for the class
package com.baeldung.decorator;

// Import the static method LOG from the LoggerUtil class
import static com.baeldung.util.LoggerUtil.LOG;

// Declare the class "DecoratorPatternDriver"
public class DecoratorPatternDriver {

    // Main method
    public static void main(String[] args) {

        // Create a base pizza with pepperoni topping
        Pizza base1 = new Pepperoni(new PizzaImpl());
        LOG.info(base1.Toppings());

        // Create a base pizza with ham, pepperoni, and pineapple toppings
        Pizza base2 = new Pineapple(new Pepperoni(new Ham(new PizzaImpl())));
        LOG.info(base2.Toppings());

        // Create a base pizza with sweetcorn and ham toppings
        Pizza base3 = new Sweetcorn(new Ham(new PizzaImpl()));
        LOG.info(base3.Toppings());

        // Create a base pizza with sweetcorn, pepperoni, ham, and pineapple toppings
        Pizza base4 = new Pineapple(new Ham(new Pepperoni(new Sweetcorn(new PizzaImpl()))));
        LOG.info(base4.Toppings());
    }
}
