package com.ohgiraffers.section01.method;

public class Application8 {
    public static void main (String[] args) {
        // static 매서드 호출
        // static 매서드 <-> non-static 매서드

        /*
        * static 메소드를 호출하는 방법
        * 클래스명, 메소드명()
        *
         */

        System.out.println("10과 20의 합 : " + Application8.sumTwoNumbers(10,20));

        System.out.println("20과 30의 합 : " + sumTwoNumbers(20,30));

        //static이 선언되어 있을 때는 바로 직접적으로 꺼내서 쓸 수 있음(이미 ram에 등록이 되어 있기 때문)
    }

    public static int sumTwoNumbers(int first, int second) {

        return first + second;
    }
}
