package com.ohgiraffers.section01.condition;

import java.util.Scanner;

public class A_If {


    /*
    * [if문 표현식]
    * if([조건식]] {
    *   // 조건식이 true일 때 실행할 명령문
    * }
     */
    /*
    * 조건식 : true or false 가 나오는 연산식을 조건식이라고 한다.
    * if 문은 조건식의 결과 값이 참(true) skdhaus {} 안에 있는 코드를 실행하고, 조건식의 결과 값이 거짓(false) {} 안에 있는 코드를 무시한다.
    * */

    public void testSimpleIfStatement() {

        // 1) 정수 한 개를 입력받아 2) 그 수가 짝수이면 3)"입력하신 숫자는 짝수입니다"라고 출력
        // 4)짝수가 아니면 출력하지 않는 코드를 작성한다.
        // 단, 조건과 상관없이 프로그램이 종료될 때 "프로그램을 종료합니다"라고 출력

        // 정수 한 개를 입력받아
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 한 개를 입력하세요");
        int num = sc.nextInt();
        // 그 수가 짝수이면 "입력하신 숫자는 짝수입니다"라고 출력
        //짝수가 아니면 출력하지 않는 코드를 작성한다.
        if (num % 2 == 0) {
            System.out.println("입력하신 숫자는 짝수입니다.");
        }
        System.out.println("프로그램을 종료합니다.");
    }


    public void testNestedIfStatement() {
        // 정수 한 개를 입력받아

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 한 개를 입력하세요");
        int num = sc.nextInt();

        //그 수가 양수인 경우에만 짝수인지를 확인하여
        if (num > 0) {
            //"입력하신 숫자는 양수이면서 짝수입니다."라고 출력하고,
            if (num % 2 == 0) {
                System.out.println("입력하신 숫자는 양수이면서 짝수입니다.");
            }
        }
            // 둘 중 하나라도 해당하지 않으면 아무 내용도 출력하지 않는 코드를 작성해보자.
            // 단, 조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다"라고 출력되도록 한다.
            System.out.println("프로그램을 종료합니다.");
        }
    }

