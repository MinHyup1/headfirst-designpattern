package com.parctice.designpattern.g_adapt;

public class Main {

    public static void main(String[] args) {
        final Duck duck = new MallardDuck();
        final Turkey turkey = new WildTurkey();
        final TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);

        testDuck(duck);
        testDuck(turkeyAdapter);

    }

    static void testDuck(Duck duck) {
        System.out.println("=====" + duck.getClass() + "=====");
        duck.quack();
        duck.fiy();
        System.out.println("=====================================\n\n");
    }
}
