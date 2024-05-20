package com.ohgiraffers.section7.practice;

public class Application {
    public static void main(String[] args) {

        // 산술 연산자

        int a = 15;
        int b = 4;
        System.out.println("a/b의 결과를 구하시오 = " + (a / b));

        int num3 = 8;
        int num4 = 3;
        System.out.println("8/3의 나머지를 구하시오 = " + (num3 % num4));

        int num5 = 5;
        int num6 = 2;
        int num7 = 3;
        System.out.println("5 * 2 - 3 = " + (num5 * num6 - num7));

        // 복합 대입 연산자

        int x = 10;
        System.out.println("x += 5 = " + (x += 5));

        int y = 20;
        System.out.println("y /= 4 = " + (y /= 4));

        int z = 8;
        System.out.println("z %= 3 = " + (z %= 3));
        System.out.println("z = " + z);

        // 증감 연산자

        int i = 0;
        int result1 = i++;
        System.out.println("i = " + i);

        int j = 10;
        int result2 = -j;
        System.out.println("-j = " + result2);

        int k = 5;
        int result3 = ++k;
        System.out.println("k = " + result3);

        // 비교 연산자

        int num1 = 10;
        int num2 = 20;

        System.out.println("num1과 num2가 같은지 비교= " + (num1 == num2));

        int num8 = 15;
        int num9 = 10;

        System.out.println("15가 10보다 큰가 = " + (num8 > num9));

        int age = 25;

        System.out.println("age는 18 이상인가 = " + (age >=18));

        // 논리 연산자

        boolean ab = true;
        boolean bc = false;

        System.out.println("ab와 bc는 모두 참이다 = " + (ab && bc));

        int age1 = 20;
        System.out.println("age1은 18 이상이며 65 미만이다 = " + (age1 >= 18 && age1 < 65));

        int x1 = 10;
        int y1 = 20;
        System.out.println("x1이 10이 아니거나 y1은 25 이상이다 = " + (x1 != 10 || y1 >= 25));



    }
}
