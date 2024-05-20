package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {
    public void testExample0() {

        /*
        * "안녕하세요"를 5번 출력하기
        * */
        //for ()

    }
    public void testSimpleForStatement() {

        /*
         * [for문 표현식]
         *
         * for([초기식]; [조건식]; [증감식]; {
         *
         *   //조건을 만족할 경우 수행할 구문
         *
         * }
         * */

        //1부터 10까지 1씩 증가시키면서 1값을 출력하는 기본 반복문
        for (int i = 5; i <= 10; i--) {
            System.out.println(i);
        }
    }

    public void testForExample() {
        /* 10명의 학생 이름을 입력받아 이름을 출력해보자 */
        Scanner sc = new Scanner(System.in);

        // 첫 번째 학생
//        System.out.println("1번째 학생의 이름을 입력해주세요 : ");
//        String student1 = sc.nextLine();
//        System.out.println("1번째 학생의 이름은 " + student1 + "입니다.");
//
//        System.out.println("2번째 학생의 이름을 입력해주세요 : ");
//        String student2 = sc.nextLine();
//        System.out.println("2번째 학생의 이름은 " + student2 + "입니다.");
//
//        System.out.println("3번째 학생의 이름을 입력해주세요 : ");
//        String student3 = sc.nextLine();
//        System.out.println("3번째 학생의 이름은 " + student3 + "입니다.");
//
//        System.out.println("4번째 학생의 이름을 입력해주세요 : ");
//        String student4 = sc.nextLine();
//        System.out.println("4번째 학생의 이름은 " + student4 + "입니다.");
//
//        System.out.println("5번째 학생의 이름을 입력해주세요 : ");
//        String student5 = sc.nextLine();
//        System.out.println("5번째 학생의 이름은 " + student5 + "입니다.");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "번째 학생의 이름을 입력해주세요 : ");
            String student = sc.nextLine();
            System.out.println(i + "번째 학생의 이름은 " + student + "입니다.");
        }

        //for문은 false가 나올 때까지 계속해서 반복
    }

    public void testExample2() {
        /*
         * 1 ~ 10까지의 합계를 구하시오
         *
         * 1부터 10까지 1씩 증가시키면서, 값을 저장할 변수(total)에 계속 누적시켜 저장된 값을 출력하세요
         * */

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
        int num6 = 6;
        int num7 = 7;
        int num8 = 8;
        int num9 = 9;
        int num10 = 10;

        int total = 0;

        total += num1;
        total += num2;
        total += num3;
        total += num4;
        total += num5;
        total += num6;
        total += num7;
        total += num8;
        total += num9;
        total += num10;

        System.out.println("total : " + total);

        //어떤 걸 반복하면 좋을지?
        // 1. 변수(num) 1씩 증가하는 값을 담기
        // 2. 저장된 변수(num)을 total에 누적시키기

        int total2 = 0;

        for (int num = 1; num <= 10; num++) {
            total2 += num;
        }
        System.out.println("total2 = " + total2);

    }

    public void testExample3() {


        /*
         * 5 ~ 10 사이의 난수를 발생시켜서
         * 5, 6, 7, 8, 9, 10
         * 1부터 발생한 난수끼리의 합계를 구해보자.
         *
         */

        int random = (int) (Math.random() * 6) + 5;
        ;

        System.out.println("random = " + random);

        int total = 0;

        if (random == 5) {
            total += 1;
            total += 2;
            total += 3;
            total += 4;
            total += 5;
        } else if (random == 6) {
            total += 1;
            total += 2;
            total += 3;
            total += 4;
            total += 5;
            total += 6;
        } else if (random == 7) {
            total += 1;
            total += 2;
            total += 3;
            total += 4;
            total += 5;
            total += 6;
            total += 7;
        } else if (random == 8) {
            total += 1;
            total += 2;
            total += 3;
            total += 4;
            total += 5;
            total += 6;
            total += 7;
            total += 8;
        } else if (random == 9) {
            total += 1;
            total += 2;
            total += 3;
            total += 4;
            total += 5;
            total += 6;
            total += 7;
            total += 8;
            total += 9;
        } else if (random == 10) {
            total += 1;
            total += 2;
            total += 3;
            total += 4;
            total += 5;
            total += 6;
            total += 7;
            total += 8;
            total += 9;
            total += 10;
        }

        System.out.println("total : 1부터 " + random + "까지의 합은 : " + total);

        int total2 = 0;
        for (int num = 1; num <= random; num++) {
            System.out.println("total2 = " + total2 + " + " + num);
            total2 += num;
        }
        System.out.println("total2 : 1부터 " + random + "까지의 합은 : " + total2);

    }

    // 혼자서 만들어보기
    public void testExample4() {

        /*
         * 두 개의 숫자를 입력받아서 작은 수에서 큰 수까지의 합계를 구하세요
         * 단, 두 숫자는 같은 숫자를 입력하지 않는다는 조건.
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수 입력 : ");
        int first = sc.nextInt();
        System.out.println("first = " + first);
        System.out.println("두 번째 정수 입력");
        int second = sc.nextInt();
        System.out.println("second = " + second);
        int total = 0;

        //첫 번째 정수가 더 큰 경우(first > second)
        if(first > second) {
            for(int i = second; i <= first; i++) {
                total = total + i;
            }
        } else {

            // second > first
            for(int i = second; i <= first; i++) {
                total = total + i;
            }
        }
        System.out.println("total = " + total);
    }

    public void testGuGudan() {

        /*
         * 키보드로 2~9 사이의 구구단을 입력받아 2~9 사이일 경우 해당 단의 구구단을 출력하고, 그렇지 않은 경우 "반드시 2~9 사이의 양수를 입력해야 합니다." 출력
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 구구단의 단 수를 입력하세요 : ");
        int dan = sc.nextInt();

        if ((dan >= 2) && (dan <= 9)) {

            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + " * " + i + " = " + (dan * i));
            }
        } else {
            System.out.println("반드시 2와 9 사이의 양수를 입력해야 합니다.");
        }

    }


}
