package com.parctice.designpattern.a_strategy.behavior.impl;

import com.parctice.designpattern.a_strategy.behavior.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("꽥");
    }
}
