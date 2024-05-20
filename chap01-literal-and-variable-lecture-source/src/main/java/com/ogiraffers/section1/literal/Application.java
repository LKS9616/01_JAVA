package com.ogiraffers.section1.literal;

public class Application {
    public static void main(String[ ] args)  {
        System.out.print("a");
        System.out.print("a");
        /*
        System.out.println("b");
        System.out.println("c");
        System.out.println("편해요 ㅎㅎ");
        System.out.print("");
         */

    // 수업목표: 여러 가진 값의 형태를 출력 할 수 있다.
        // 정수 출력
        System.out.println("123");
        // 실수 출력
        System.out.println("12,3");

        //문자 출력
        System.out.println('a'); // 문자 형태의 값은 홈따옴표로 감싸주어야 한다.
        //System.out.println('ab');
        System.out.println('1'); // 숫자 값이지만 홀따옴표로 감싸져 있는 경우 문자 '1'이라고 판단한다.
        //System.out.println(''); 빈 문자는 인식 X

        //문자열 출력
        System.out.println("안녕하세요"); // 문자열은 문자가 여러 개가 나열된 형태를 의미하며 쌍따옴표로 감싸져 있다.
        System.out.println("123");  // 필기 정수이지만 쌍따옴표로 감싸져 있기 때문에 문자열로 보아야 한다.
        System.out.println("");  // 아무 값도 없는 빈 쌍따옴표도 문자열로 () -> 취급된다
        System.out.println("a");  // 한 개의 문자도 쌍따옴표로 감싸면 문자열이다 (문자 'a' 랑은 달라요)

        // 논리값 출력
        System.out.println(true);
        System.out.println(false);

    }
}