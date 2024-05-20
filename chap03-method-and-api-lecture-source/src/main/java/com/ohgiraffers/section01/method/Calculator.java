package com.ohgiraffers.section01.method;

public class Calculator {

    //삼항연산자로 두 수를 비교해서 작은 값을 return 해주는 메서드
    public int nonStaticMinNumberOf (int first, int second) {

        // int result = (first > second)? second : first;

        return (first > second)? second : first;
    }

    public static int staticMaxNumberOf(int first, int second) {

        return (first > second)? first : second;

    }

    // 더하기, 빼기, 곱하기, 나누기, 나머지
    public int numberPlus(int num1, int num2) {
        return (num1 + num2);
    }

    public int numberMinus(int num1, int num2) {
        return (num1 - num2);
    }

    public int numberMultiple(int num1, int num2) {
        return (num1 * num2);
    }

    public int numberDivide(int num1, int num2) {
        return (num1 / num2);
    }

    public static int staticNumberRemainder(int num1, int num2) {
        return (num1 % num2);

    }

    public int average(int num1, int num2, int num3) {return ((num1 + num2 + num3)/3);}
}
