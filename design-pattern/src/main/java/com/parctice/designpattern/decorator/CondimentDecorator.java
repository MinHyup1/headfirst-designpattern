package com.parctice.designpattern.decorator;

import com.parctice.designpattern.decorator.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;
    protected int count = 1;

    public abstract String getDescription();
}
