package com.parctice.designpattern.h_templatemethod.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {

    @Test
    void 오리_정렬_코드_테스트() {
        Duck[] ducks = {
                new Duck("평범한 오리", 5),
                new Duck("뚱뚱한 오리", 10),
                new Duck("날씬한 오리", 3),
                new Duck("새끼 오리", 1),
                new Duck("평범한 오리 2", 5),
                new Duck("평범한 오리 3", 5),
        };


        System.out.println("정렬 전 : " + Arrays.toString(ducks));
        Arrays.sort(ducks);
        System.out.println("정렬 후 : " + Arrays.toString(ducks));

    }
}