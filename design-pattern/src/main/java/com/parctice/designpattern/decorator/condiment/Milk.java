package com.parctice.designpattern.decorator.condiment;

import com.parctice.designpattern.decorator.CondimentDecorator;
import com.parctice.designpattern.decorator.beverage.Beverage;

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
