package com.parctice.designpattern.e_singleton;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.jupiter.api.Assertions.*;

class ChocolateBoilerTest {

    @Test
    void 멀티스레드_테스트() {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) { // 총 5개의 작업 제출
            executor.submit(() -> {
                ChocolateBoilerEnum singletonInstance = ChocolateBoilerEnum.INSTANCE;

                singletonInstance.fill();
                System.out.println(Thread.currentThread().getName() + " - 실행 중" + "\n 싱글톤 객체 : " + singletonInstance );
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        executor.shutdown();
    }
}