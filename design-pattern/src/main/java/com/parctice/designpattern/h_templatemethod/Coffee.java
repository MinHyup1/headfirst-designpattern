package com.parctice.designpattern.h_templatemethod;

public class Coffee extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("필터로 커피를 우려내는 중");
    }
}
