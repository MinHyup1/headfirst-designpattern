package com.parctice.designpattern.c_decorator;

import com.parctice.designpattern.c_decorator.beverage.Beverage;
import com.parctice.designpattern.c_decorator.beverage.DarkRoast;
import com.parctice.designpattern.c_decorator.beverage.Decaf;
import com.parctice.designpattern.c_decorator.beverage.HouseBlend;
import com.parctice.designpattern.c_decorator.condiment.Mocha;
import com.parctice.designpattern.c_decorator.condiment.Whip;

public class CafeApplication {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        System.out.println(beverage.getDescription() + " 가격(원) : " + beverage.cost());

        Beverage beverage2 = new Decaf();
        beverage2 = new Mocha(beverage2,3);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " 가격(원) : " + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        System.out.println(beverage3.getDescription() + " 가격(원) : " + beverage3.cost());
    }
}
