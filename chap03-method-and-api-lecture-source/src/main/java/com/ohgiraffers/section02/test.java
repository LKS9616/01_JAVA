package com.ohgiraffers.section02;

import com.ohgiraffers.section01.method.Calculator;

public class test {
    public static void main(String args[]) {

        int korean = 95;
        int math = 93;
        int science = 87;

        Calculator cal = new Calculator();
        int avg = cal.average(korean, math, science);
        System.out.println("국어, 수학, 과학의 평균은 : " + avg + "이다.");






    }
}
