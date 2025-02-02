package com.parctice.designpattern.decorator;

import com.parctice.designpattern.decorator.beverage.Beverage;
import com.parctice.designpattern.decorator.beverage.DarkRoast;
import com.parctice.designpattern.decorator.beverage.Decaf;
import com.parctice.designpattern.decorator.condiment.Mocha;
import com.parctice.designpattern.decorator.condiment.Whip;

public class CafeApplication {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        System.out.println(beverage.getDescription() + " 가격(원) : " + beverage.cost());

        Beverage beverage2 = new Decaf();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        System.out.println(beverage2.getDescription() + " 가격(원) : " + beverage2.cost());

    }
}
