package com.parctice.designpattern.a_strategy.duck;

import com.parctice.designpattern.a_strategy.behavior.impl.FlyNoWay;
import com.parctice.designpattern.a_strategy.behavior.impl.Squeak;

public class ModelDuck extends Duck {
    public ModelDuck() {
        super(new Squeak(),new FlyNoWay());
    }
}
