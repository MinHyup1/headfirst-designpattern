package com.parctice.designpattern.c_decorator.condiment;

import com.parctice.designpattern.c_decorator.CondimentDecorator;
import com.parctice.designpattern.c_decorator.beverage.Beverage;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", 우유";
    }

    @Override
    public Integer cost() {
        return this.beverage.cost() + 400;
    }
}
