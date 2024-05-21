package com.ohgiraffers.section02.demensinal;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /*
        * 이차원 배열의 선언
        *
        * 자료형[][] 변수명 * new 자료형[할당할 배열의 갯수][할당할 배열의 길이];
        * */


        int [][] iarr = new int [3][5];
//        iarr [0][0] = 1;
//        iarr [0][1] = 2;
//        iarr [0][2] = 3;
//        iarr [0][3] = 4;
//        iarr [0][4] = 5;
//
//        iarr [1][0] = 6;
//        iarr [1][1] = 7;
//        iarr [1][2] = 8;
//        iarr [1][3] = 9;
//        iarr [1][4] = 10;
//
//        iarr [2][0] = 11;
//        iarr [2][1] = 12;
//        iarr [2][2] = 13;
//        iarr [2][3] = 14;
//        iarr [2][4] = 15;

//        System.out.println("5번째 인덱스 배열");
//        System.out.print(iarr[0][0] + " ");
//        System.out.print(iarr[0][1] + " ");
//        System.out.print(iarr[0][2] + " ");
//        System.out.print(iarr[0][3] + " ");
//        System.out.print(iarr[0][4] + " ");
//
//        System.out.print(iarr[1][0] + " ");
//        System.out.print(iarr[1][1] + " ");
//        System.out.print(iarr[1][2] + " ");
//        System.out.print(iarr[1][3] + " ");
//        System.out.print(iarr[1][4] + " ");
//
//        System.out.print(iarr[2][0] + " ");
//        System.out.print(iarr[2][1] + " ");
//        System.out.print(iarr[2][2] + " ");
//        System.out.print(iarr[2][3] + " ");
//        System.out.print(iarr[2][4] + " ");

        // 각 인덱스의 배열에 접근

        int num = 0;

        for(int i = 0; i < iarr.length; i++){
            System.out.println(i + "번째 인덱스 배열");
            for(int j = 0; j < iarr[i].length; j++){
            iarr[i][j] = num;
            num++;
                System.out.print(iarr [i][j]);
        }
        }





    }
}
