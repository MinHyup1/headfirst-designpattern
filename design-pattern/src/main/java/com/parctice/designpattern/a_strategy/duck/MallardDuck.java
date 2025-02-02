package com.parctice.designpattern.a_strategy.duck;

import com.parctice.designpattern.a_strategy.behavior.impl.Fly;
import com.parctice.designpattern.a_strategy.behavior.impl.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        super(new Quack(),new Fly());
    }
}
