package com.parctice.designpattern.c_decorator;

import com.parctice.designpattern.c_decorator.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;
    protected int count = 1;

    public abstract String getDescription();
}
