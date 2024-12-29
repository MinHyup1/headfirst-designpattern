package com.parctice.designpattern.strategy.duck;

import com.parctice.designpattern.strategy.behavior.impl.Fly;
import com.parctice.designpattern.strategy.behavior.impl.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        super(new Quack(),new Fly());
    }
}
