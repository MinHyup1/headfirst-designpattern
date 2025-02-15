package com.parctice.designpattern.d_factory.store;

import com.parctice.designpattern.d_factory.pizza.Pizza;
import com.parctice.designpattern.d_factory.pizza.newyork.NYStyleCheesePizza;
import com.parctice.designpattern.d_factory.pizza.newyork.NYStyleClamPizza;
import com.parctice.designpattern.d_factory.pizza.newyork.NYStylePepperoniPizza;
import com.parctice.designpattern.d_factory.pizza.newyork.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")) return new NYStyleCheesePizza();

        if(type.equals("veggie")) return new NYStyleVeggiePizza();

        if(type.equals("clam")) return new NYStyleClamPizza();

        if(type.equals("pepperoni")) return new NYStylePepperoniPizza();

        throw new IllegalArgumentException();
    }
}
