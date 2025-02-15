package com.parctice.designpattern.d_factory.store;

import com.parctice.designpattern.d_factory.pizza.*;
import com.parctice.designpattern.d_factory.pizza.ingredient.factory.NYPizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        NYPizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(type.equals("cheese")) {
            CheesePizza cheesePizza = new CheesePizza(ingredientFactory);
            cheesePizza.setName("뉴욕 스타일 치즈 피자");
            return cheesePizza;
        }

        if(type.equals("veggie")) return new VeggiePizza();

        if(type.equals("clam")) return new ClamPizza(ingredientFactory);

        if(type.equals("pepperoni")) return new PepperoniPizza();

        throw new IllegalArgumentException();
    }
}
