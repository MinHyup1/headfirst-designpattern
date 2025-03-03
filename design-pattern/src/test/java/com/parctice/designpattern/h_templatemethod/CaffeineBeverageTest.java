package com.parctice.designpattern.h_templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaffeineBeverageTest {

    @Test
    void 커피_홍차_템플릿_메소드_패턴_출력_테스트 () {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        coffee.prepareRecipe();
        tea.prepareRecipe();

    }

}