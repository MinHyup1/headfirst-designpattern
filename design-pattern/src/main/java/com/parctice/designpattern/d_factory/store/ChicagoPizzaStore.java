package com.parctice.designpattern.d_factory.store;

import com.parctice.designpattern.d_factory.pizza.CheesePizza;
import com.parctice.designpattern.d_factory.pizza.Pizza;
import com.parctice.designpattern.d_factory.pizza.ingredient.factory.ChicagoPizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        ChicagoPizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if(type.equals("cheese")) {
            CheesePizza cheesePizza = new CheesePizza(ingredientFactory);
            cheesePizza.setName("시카고 스타일 치즈 피자");
            return cheesePizza;
        }

        throw new IllegalArgumentException();
    }
}
