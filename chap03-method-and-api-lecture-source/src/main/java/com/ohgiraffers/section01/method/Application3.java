package com.ohgiraffers.section01.method;

public class Application3 {
    public static void main(String[] args) {

        int num = 0;

        /*
        * 전달인자와 매개변수를 이용한 메소드 호출
        *
        * 변수의 종류
        *   1. 지역변수
        *   2. 매개변수
        *   3. 전역변수(필드)
        *   4. 클래스(static) 변수
         */

        /*
        * 지역변수
        *
        * 지역변수는 선택한 메소드 블럭(영역) 내부에서만 사용 가능하다.
        * 다른 메소드 간 서로 공유해야 하는 값이 존재할 경우, 메소드 호출시 사용하는 괄호를 이용해서 값을 전달할 수 있다.
        * 이 때, 전달되는 값을 전달인자라고 부르고 메소드 선언부 괄호 안에 전달인자를 받기 위해 선언하는 변수를 매개변수라고 부른다.
         */
        Application3 app3 =  new Application3();
        app3.testMethod(50);
//        app3.testMethod( age "20"); // 자료명이 틀림
//        app3.testMethod( age 20, 30, 40); // 갯수가 틀림
//        app3.testMethod(); // 아무 것도 들어가지 않음

        // 전달인자와 매개변수를 이용한 메소드 호출 테스트

        int age = 15;
        // String str = "15";
        app3.testMethod(15);

        //자동형변환을 이용해 값 전달이 가능하다.
        byte byteAge = 10;
        app3.testMethod(byteAge); // 자동형변환

        long longAge = 5;
        app3.testMethod((int)longAge);

        app3.testMethod(age + 3);





    }
    // 나이를 받아와서 "당신의 나이는 ~세 입니다."라고 출력하는 메소드
    public void testMethod(int age) {
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}
