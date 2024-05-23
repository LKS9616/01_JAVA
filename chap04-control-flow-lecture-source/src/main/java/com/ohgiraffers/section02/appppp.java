package com.ohgiraffers.section02;

import java.util.Scanner;

public class appppp {

    public static void main(String[] args) {
        Leekyusub lks = new Leekyusub();
        //lks.plusTwoNumbers();

        double first = 30;
        double second = 15.7;

        // 빼기 연산
        Jdh jdh = new Jdh();
        jdh.minusTwoNumbers(first, second);
        jdh.minusTwoNumbersWithScanner(); // 실수를 입력받아 연산 수행

        Parkhyochan phc = new Parkhyochan();
        phc.multipleTest();


        System.out.println("Hello World의 계산기입니다.");
        System.out.println("원하는 연산자를 선택하세요");
        Scanner sc = new Scanner(System.in);
        String sign = sc.nextLine();

        switch (sign) {
            case ("+"):
                lks.plusTwoNumbers();

            case ("-"):
                jdh.minusTwoNumbersWithScanner();

            case ("*"):
                phc.multipleTest();

            case ("exit"):
                break;

            default:
                System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요");

        }


        System.out.println("프로그램을 종료합니다.");

    }
}
