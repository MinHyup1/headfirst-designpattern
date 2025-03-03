package com.parctice.designpattern.h_templatemethod;

public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourIncCup();
        addCondiments();
    }

    abstract void brew();

    //hook 메서드, 필요하지 않다면 해당 메서드를 구현하지 않아도 됨.
    void addCondiments() {};

    final void boilWater() {
        System.out.println("물 끓이는 중");
    }

    final void pourIncCup() {
        System.out.println("컵에 따르는 중");
    }

}
