package com.parctice.designpattern.d_factory.store;

import com.parctice.designpattern.d_factory.pizza.Pizza;
import com.parctice.designpattern.d_factory.pizza.chicago.ChicagoStyleCheesePizza;
import com.parctice.designpattern.d_factory.pizza.chicago.ChicagoStyleClamPizza;
import com.parctice.designpattern.d_factory.pizza.chicago.ChicagoStylePepperoniPizza;
import com.parctice.designpattern.d_factory.pizza.chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")) return new ChicagoStyleCheesePizza();

        if(type.equals("veggie")) return new ChicagoStyleVeggiePizza();

        if(type.equals("clam")) return new ChicagoStyleClamPizza();

        if(type.equals("pepperoni")) return new ChicagoStylePepperoniPizza();

        throw new IllegalArgumentException();
    }
}
