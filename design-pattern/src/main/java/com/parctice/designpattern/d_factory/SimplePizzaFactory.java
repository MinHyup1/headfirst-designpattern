package com.parctice.designpattern.d_factory;

import com.parctice.designpattern.d_factory.pizza.*;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            return new CheesePizza();
        }

        if (type.equals("pepperoni")){
            return new PepperoniPizza();
        }

        if (type.equals("clam")){
            return new ClamPizza();
        }

        if (type.equals("veggie")){
            return new VeggiePizza();
        }

        throw new IllegalArgumentException("type");
    }
}
