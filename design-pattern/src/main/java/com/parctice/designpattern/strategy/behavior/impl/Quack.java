package com.parctice.designpattern.strategy.behavior.impl;

import com.parctice.designpattern.strategy.behavior.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("꽥");
    }
}
