package com.parctice.designpattern.c_decorator.beverage;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        super.description = "다크 로스트 커피";
    }

    @Override
    public Integer cost() {
        return 5000;
    }
}
