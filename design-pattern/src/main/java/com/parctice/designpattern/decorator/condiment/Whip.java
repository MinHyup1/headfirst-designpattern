package com.parctice.designpattern.decorator.condiment;

import com.parctice.designpattern.decorator.CondimentDecorator;
import com.parctice.designpattern.decorator.beverage.Beverage;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", 휘핑";
    }

    @Override
    public Integer cost() {
        return this.beverage.cost() + 300;
    }
}
