package com.parctice.designpattern.d_factory.pizza.ingredient.factory;

import com.parctice.designpattern.d_factory.pizza.ingredient.*;
import com.parctice.designpattern.d_factory.pizza.ingredient.newyork.MarinaraSauce;
import com.parctice.designpattern.d_factory.pizza.ingredient.newyork.ReggianoCheese;
import com.parctice.designpattern.d_factory.pizza.ingredient.newyork.ThinCrustDough;
import com.parctice.designpattern.d_factory.pizza.ingredient.veggie.Garlic;
import com.parctice.designpattern.d_factory.pizza.ingredient.veggie.Mushroom;
import com.parctice.designpattern.d_factory.pizza.ingredient.veggie.Onion;
import com.parctice.designpattern.d_factory.pizza.ingredient.veggie.redPepper;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new Dough();
    }

    @Override
    public Sauce createSauce() {
        return new Sauce();
    }

    @Override
    public Cheese createCheese() {
        return new Cheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new redPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Clams createCLam() {
        return null;
    }
}
