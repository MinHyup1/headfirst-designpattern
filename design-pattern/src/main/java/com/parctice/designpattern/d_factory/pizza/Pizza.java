package com.parctice.designpattern.d_factory.pizza;

import com.parctice.designpattern.d_factory.pizza.ingredient.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    @Getter
    @Setter
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies veggies[];
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;
    protected List<String> toppings = new ArrayList<String>();

    public abstract void prepare();

    public void bake(){
        System.out.println("175도에서 25분 간 굽기");
    };

    public void cut(){
        System.out.println("피자를 사선으로 자르기");
    };

    public void box(){
        System.out.println("상자에 피자 담기");
    };

}
