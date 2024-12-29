package com.parctice.designpattern.strategy.behavior.impl;

import com.parctice.designpattern.strategy.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("비행불가");
    }
}
