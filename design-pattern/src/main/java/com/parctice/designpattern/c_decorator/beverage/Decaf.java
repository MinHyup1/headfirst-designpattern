package com.parctice.designpattern.c_decorator.beverage;

public class Decaf extends Beverage{

    public Decaf() {
        super.description = "디 카페인 커피";
    }
    @Override
    public Integer cost() {
        return 4500;
    }
}
