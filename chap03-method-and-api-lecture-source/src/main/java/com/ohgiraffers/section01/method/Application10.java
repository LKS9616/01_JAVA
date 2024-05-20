package com.ohgiraffers.section01.method;

public class Application10 {
    public static void main(String[] args) {

        int num1 = 16;
        int num2 = 5;

        // 더하기

        // 빼기

        // 곱하기

        // 나누기

        // 나머지

        // 이 각각을 수행할 수 있는 메서드를 만들고 더하기 빼기 곱하기 나누기는 non 나머지는 static

        //더하기

        Calculator calc = new Calculator();

        int plus = calc.numberPlus(num1, num2);

        System.out.println("두 수를 더한 값은 : " + plus);

        //빼기

        int minus = calc.numberMinus(num1, num2);

        System.out.println("두 수를 뺀 값은 : " + minus);

        //곱하기

        int multiple = calc.numberMultiple(num1, num2);

        System.out.println("두 수를 곱한 값은 : " + multiple);

        //나누기

       int divide = calc.numberDivide(num1, num2);

        System.out.println("두 수를 나눈 값은 : " + divide);

        int remainder = Calculator.staticNumberRemainder(num1, num2);

        System.out.println("두 수를 나눈 나머지는 : " + remainder);



    }



}
