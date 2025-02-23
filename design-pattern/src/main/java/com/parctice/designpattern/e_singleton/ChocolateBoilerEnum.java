package com.parctice.designpattern.e_singleton;

public enum ChocolateBoilerEnum {
    INSTANCE;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoilerEnum(){
        empty = true;
        boiled = false;
    }

    public void fill() {
        if(isEmpty()) {
            System.out.println("fill");
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

    @Override
    public String toString() {
        return "ChocolateBoilerEnum{" +
                "empty=" + empty +
                ", boiled=" + boiled +
                '}';
    }
}
