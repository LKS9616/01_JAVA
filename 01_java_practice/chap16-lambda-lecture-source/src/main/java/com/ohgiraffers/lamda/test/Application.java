package com.ohgiraffers.lamda.test;

import java.time.LocalTime;
import java.util.function.BiConsumer;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;

public class Application {
    public static void main(String[] args) {

        Application app = new Application();
        app.test1();
        app.test2();
        app.test3();
        app.test4();
        app.test5();


    }
    private void test1() {

        BiConsumer<String, LocalTime> biConsumer = (str, time) -> System.out.println(str + "은 " + time + "이다.");
        biConsumer.accept("현재 시각", LocalTime.now());

    }

    private void test2() {
        IntSupplier lottery = () -> (int) (Math.random() * 45 ) + 1;
        System.out.println("로또 번호는 " + lottery.getAsInt() + "입니다.");

        }

    private void test3() {
        IntConsumer intConsumer = (num) -> System.out.println("입력하신 원화를 달러로 환산하면 " + (num / 1350) + "달러입니다.");
        intConsumer.accept(15000);


    }

    private void test4() {

        int [] lottery = new int [6];



    }

    private void test5() {


    }


}
