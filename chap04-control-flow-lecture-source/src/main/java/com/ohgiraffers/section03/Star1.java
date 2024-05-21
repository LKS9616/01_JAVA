package com.ohgiraffers.section03;

import java.util.Scanner;

public class Star1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요 : ");

        //int num = 5;
        // i = 1

        for(int i = 0; i < 5; i ++) {
            for(int j = 5; j >= i; j++) {
                System.out.print("*");
            }
            //줄바꿈
            System.out.println();
        }
    }
    /*
    *
    **
    *
     */
}
