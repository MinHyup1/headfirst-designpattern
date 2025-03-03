package com.parctice.designpattern.g_adapt;

public class TurkeyAdapter implements Duck{
    private final Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fiy() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
