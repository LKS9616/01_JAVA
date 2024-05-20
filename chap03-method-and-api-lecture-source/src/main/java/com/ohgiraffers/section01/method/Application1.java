package com.ohgiraffers.section01.method;

public class Application1 {
    public static void main(String[] args) {
        // main: 메소드 이름, 4번째 줄의 코드가 중괄호 안의 코드가 제일 먼저 실행되도록 함

        System.out.println("main() 시작됨....");

        /*
        * [접근 제어자] [반환타입] [메소드 이름] [매개변수(여러 개 들어갈 수 있음] {
        *
        *   // 실행할 코드
        *
        *   // 반환 타입이 있을 경우 반환 타입에 맞게 return
        * }
         */

        /*
        * 메소드 호출 방법
        *
        * 1. 사용 준비
        * [클래스명] [사용할 이름] = new [클래스명]():
        *
        * 2. 사용
        * [사용할 이름].[메소드명] ():
         */

        //method 호출시 코드 먼저 실행되고 다음에 이후 코드가 실행됨


        Application1 app1 = new Application1();
        app1.methodA();

        System.out.println("main() 종료됨...");

        // 변화형 변수 값

        // 변수는 ram에 저장되는데 3구역으로 나눠짐. stack, heap, static
        // int i = 0일경우 stack에 i라는 공간을 만들고 0을 그 안에 저장
        // Application app1 = new의 경우 heap의 주소값이 대신 app1에 저장됨
        // 기본자료형은 값이 직접적으로 저장되지만 참조연산자의 경우 주소값을 불러와서 저장

        // 연산자- 정수형(byte short int long)
        // 실수형- float double
        // 문자형: char
        // 논리형- boolean
        // int double 기본자료형
    }

public void methodA () {

    System.out.println("method A 호출함...");

    methodB();

    System.out.println("method A 종료함...");
}
public void methodB () {

    System.out.println("method B 호출함...");

    methodC();

    System.out.println("method B 종료됨...");


}
public void methodC () {

    System.out.println("method C 호출함...");

    System.out.println("method C 종료됨...");
}
}
