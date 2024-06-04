package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class CharacterProcess {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("영문자를 입력해주세요");
        String str = sc.nextLine();
        int count = 0;
        boolean isEnglish = true;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) < 96 && str.charAt(i) > 123) || (str.charAt(i) < 64 && str.charAt(i) > 91)) {
                System.out.print("영문자가 아닙니다.");
            } else {
                System.out.println("영문자입니다.");
                break;
            }


        }
        System.out.println("str.length() = " + str.length());
    }

}


