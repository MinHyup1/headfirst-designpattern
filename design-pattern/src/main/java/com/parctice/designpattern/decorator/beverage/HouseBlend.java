package com.parctice.designpattern.decorator.beverage;

public class HouseBlend extends Beverage{

    public HouseBlend() {
        super.description = "하우스 블랜드 커피";
    }

    @Override
    public Integer cost() {
        return 10000;
    }
}
