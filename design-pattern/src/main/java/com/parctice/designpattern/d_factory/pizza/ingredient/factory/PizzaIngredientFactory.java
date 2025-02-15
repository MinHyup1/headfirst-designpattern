package com.parctice.designpattern.d_factory.pizza.ingredient.factory;

import com.parctice.designpattern.d_factory.pizza.ingredient.*;

public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createCLam();

}
