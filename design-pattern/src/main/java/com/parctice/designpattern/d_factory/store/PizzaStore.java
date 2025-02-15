package com.parctice.designpattern.d_factory.store;
import com.parctice.designpattern.d_factory.pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        final Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
