package com.parctice.designpattern.c_decorator.condiment;

import com.parctice.designpattern.c_decorator.CondimentDecorator;
import com.parctice.designpattern.c_decorator.beverage.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", 두유";
    }

    @Override
    public Integer cost() {
        return this.beverage.cost() + 500;
    }
}
