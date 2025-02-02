package com.parctice.designpattern.decorator.condiment;

import com.parctice.designpattern.decorator.CondimentDecorator;
import com.parctice.designpattern.decorator.beverage.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    @Override
    public Integer cost() {
        return beverage.cost() + 500;
    }

}
