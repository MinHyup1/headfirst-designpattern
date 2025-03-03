package com.parctice.designpattern.h_templatemethod.sort;

public class Duck implements Comparable<Duck>{
    final String name;
    final Integer weight;

    public Duck(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Duck otherDuck) {
        return this.weight.compareTo(otherDuck.weight);
    }

    @Override
    public String toString() {
        return "이름 : " + name + '\'' + ", 체중 : " + weight + "\n";
    }
}
