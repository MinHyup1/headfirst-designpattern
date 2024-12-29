package com.parctice.designpattern.strategy.duck;

import com.parctice.designpattern.strategy.behavior.impl.FlyNoWay;
import com.parctice.designpattern.strategy.behavior.impl.Squeak;

public class ModelDuck extends Duck {
    public ModelDuck() {
        super(new Squeak(),new FlyNoWay());
    }
}
