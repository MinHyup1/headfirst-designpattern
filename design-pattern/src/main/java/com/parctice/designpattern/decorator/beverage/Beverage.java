package com.parctice.designpattern.decorator.beverage;

import lombok.Getter;

public abstract class Beverage {

    @Getter
    String description;

    public abstract Integer cost();
}
