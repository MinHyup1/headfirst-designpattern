package com.parctice.designpattern.a_strategy.behavior.impl;

import com.parctice.designpattern.a_strategy.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("비행불가");
    }
}
