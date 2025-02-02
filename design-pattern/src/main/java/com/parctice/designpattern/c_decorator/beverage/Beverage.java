package com.parctice.designpattern.c_decorator.beverage;

import lombok.Getter;

@Getter
public abstract class Beverage {

    String description;

    public abstract Integer cost();
}
