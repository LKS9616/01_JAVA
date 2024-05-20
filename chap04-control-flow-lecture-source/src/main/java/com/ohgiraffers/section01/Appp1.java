package com.ohgiraffers.section01;

import java.util.Scanner;

public class Appp1 {
    public void test1 () {

//        ## Q. 다음의 내용을 조건문(if, else if, else, switch 중 아무거나)를 사용해서 코드로 표현해보자
//
//### 1. 9세 이상이면서 110cm 이상인 사람만 놀이기구 탑승가능
//
//<aside>
//🤖 **나이와 키를 입력받는다. 모든 조건을 충족하면
//”놀이기구를 탑승 하실 수 있습니다.”를 출력하고,
//조건이 하나라도 충족되지 않을 경우
//”놀이기구를 탑승 하실 수 없습니다.”를 출력한다.
//
//+ 문제
//어떤 조건에 의해 탑승할 수 없는지 이유를 같이 출력해준다.
//- “나이가 9살 미만이라 탑승 하실 수 없습니다.”
//- “키가 110cm 미만이라 탑승 하실 수 없습니다.”
//- “나이가 9살 미만이고, 키가 110cm 미만이라 탑승하실 수 없습니다.”**
//
//</aside>
//
//### 2. 두 과목의 평균이 60점 이상이면 합격, 한 과목이라도 40 점 미만이면 불합격
//
//<aside>
//🤖 **영어와 수학의 점수를 입력 받는다.
//두 과목의 평균이 60점 이상이고, 두 과목 모두다 40점 이상이여야 합격이 가능하다.
//평균이 60점 미만일 경우 “시험 불합격”
//60점은 넘지만 한과목이 40점 미만일 경우 “한과목 과락으로 인한 불합격”
//두 조건다 통과할경우 “시험 합격”
//을 출력한다.**

        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력해주세요.");
        int age = sc.nextInt();
        System.out.println("키를 입력해주세요.");
        int height = sc.nextInt();
        if (age >=9) {
            if (height >= 110) {
                System.out.println("놀이기구를 탑승하실 수 있습니다.");
            }
            else if (height < 110) {
                System.out.println("놀이기구를 탑승하실 수 없습니다.");
                System.out.println("키가 110cm 미만이라 탑승하실 수 없습니다.");
            }
        }
        else if (age < 9) {
            if (height >= 110) {
                System.out.println("놀이기구를 탑승하실 수 없습니다.");
                System.out.println("나이가 9살 미만이라 탑승하실 수 없습니다");
            }
            else if (height < 110) {
                System.out.println("놀이기구를 탑승하실 수 없습니다.");
                System.out.println("나이가 9살 미만이고, 키가 110cm 미만이라 탑승하실 수 없습니다.");
            }
        }



    }

    public void test2 () {
        Scanner sc = new Scanner(System.in);
        System.out.println("영어 점수를 입력해 주세요.");
        int english = sc.nextInt();
        System.out.println("수학 점수를 입력해 주세요.");
        int math = sc.nextInt();
        int avg = (math + english) / 2;
        if (avg >= 60) {
            if (english >= 40) {
                if (math >= 40) {
                    System.out.println("시험 합격");
                }
                else if (math < 40) {
                    System.out.println("한 과목 과락으로 인한 불합격");
                }
            }
            if (english < 40) {
                if (math >= 40) {
                    System.out.println("한 과목 과락으로 인한 불합격");
                }
                else if (math < 40) {
                    System.out.println("한 과목 과락으로 인한 불합격");
                }
            }

        }
        else if (avg < 60) {
            System.out.println("시험 불합격");
        }


    }

}
