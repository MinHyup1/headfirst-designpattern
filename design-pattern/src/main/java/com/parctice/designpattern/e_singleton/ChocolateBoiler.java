package com.parctice.designpattern.e_singleton;

public class ChocolateBoiler {
    private static ChocolateBoiler singletonInstance;
    private boolean empty;
    private boolean boiled;

    static synchronized ChocolateBoiler getInstance() {
        if (singletonInstance == null) {
            System.out.println("is null");
            singletonInstance = new ChocolateBoiler();
        }
        return singletonInstance;
    }

    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    public void fill() {
        if(isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if(!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    private boolean isEmpty() {
        return empty;
    }

    private boolean isBoiled() {
        return boiled;
    }
}
