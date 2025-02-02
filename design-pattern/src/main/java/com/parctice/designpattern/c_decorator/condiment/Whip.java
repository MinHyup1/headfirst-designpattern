package com.parctice.designpattern.c_decorator.condiment;

import com.parctice.designpattern.c_decorator.CondimentDecorator;
import com.parctice.designpattern.c_decorator.beverage.Beverage;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public Whip(Beverage beverage, int count) {
        this.beverage = beverage;
        this.count = count;
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
