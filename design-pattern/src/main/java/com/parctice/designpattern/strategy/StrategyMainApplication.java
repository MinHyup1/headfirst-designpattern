package com.parctice.designpattern.strategy;

import com.parctice.designpattern.strategy.duck.Duck;
import com.parctice.designpattern.strategy.duck.MallardDuck;
import com.parctice.designpattern.strategy.duck.ModelDuck;

public class StrategyMainApplication {
    public static void main(String[] args) {
        System.out.println("/* 청동오리 */");
        final Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println("/* 오리인형 */");
        final Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.performQuack();
    }
}
