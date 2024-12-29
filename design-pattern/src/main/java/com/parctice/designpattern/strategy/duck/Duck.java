package com.parctice.designpattern.strategy.duck;

import com.parctice.designpattern.strategy.behavior.FlyBehavior;
import com.parctice.designpattern.strategy.behavior.QuackBehavior;


public abstract class Duck {
    protected final QuackBehavior quackBehavior;
    protected final FlyBehavior flyBehavior;

    protected Duck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }

    public void performQuack() {
        this.quackBehavior.quack();
    }

    public void performFly() {
        this.flyBehavior.fly();
    }
}
