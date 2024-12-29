package com.parctice.designpattern.strategy.behavior.impl;

import com.parctice.designpattern.strategy.behavior.FlyBehavior;

public class Fly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("비행중");
    }
}
