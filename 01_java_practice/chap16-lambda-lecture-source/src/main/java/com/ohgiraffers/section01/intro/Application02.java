package com.ohgiraffers.section01.intro;

public class Application02 {

    public static void main(String[] args) {

        OuterCalculator.Sum sum = (x, y) -> x + y;

        System.out.println("20과 10의 합 : " + sum.sumTwoNumber(20, 10));

        OuterCalculator.Minus minus = (x, y) -> x - y;

        System.out.println("20과 10의 차이 : " + minus.minusTwoNumber(20, 10));

        OuterCalculator.Multiple multiple = (x, y) -> x * y;

        System.out.println("20과 10의 곱 : " + multiple.multipleTwoNumber(20, 10));

        OuterCalculator.Division division = (x, y) -> x / y;

        System.out.println("20과 10의 나누기 : " + division.divisionTwoNumber(20, 10));

        // minus
        // multiple
        // division



    }
}
