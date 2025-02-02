package com.parctice.designpattern.decorator.condiment;

import com.parctice.designpattern.decorator.CondimentDecorator;
import com.parctice.designpattern.decorator.beverage.Beverage;

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
