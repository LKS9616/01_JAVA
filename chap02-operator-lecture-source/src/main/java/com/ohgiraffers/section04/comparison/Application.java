package com.ohgiraffers.section04.comparison;

public class Application {
    public static void main(String[] args) {

        /*
        * 비교연산자
        *
        * 비교연산자는 피연산자 사이에 상대적인 크기를 판단해 참 혹은 거짓을 반환하는 연산자이다.
        * 연산자 중 참 혹은 거짓을 반환하는 연산자는 삼항연산자의 조건식이나 조건문의 조건절에 많이 사용된다.
        *
        * */

        /*
        * 비교연산자의 종류
        * '==' : 왼쪽의 피연산자와 오른쪽의 피연산자가 같으면 true 아니면 false를 반환
        * '!=' : 왼쪽의 피연산자와 오른쪽의 피연산자가 다르면 true 같으면 false를 반환
        * '>' : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크면 true 아니면 false를 반환
        * '>=' : 왼쪽의 피연산자가 오른쪽의 피연산자보다 같거나 크면 true 아니면 false를 반환
        * '<' : 왼쪽의 피연산자가 오른쪽의 피연산자보다 작으면 true 아니면 false를 반환
        * '<=': 왼쪽의 피연산자가 오른쪽의 피연산자보다 같거나 작으면 true 아니면 false를 반환
        * */

        int inum1 = 10;
        int inum2 = 20;

        System.out.println("========== 정수값 비교 ========== ");
        System.out.println("inum1과 inum2가 같은지 비교 : " + (inum1 == inum2)); //false
        System.out.println("inum1과 inum2가 같지 않은지 비교 : " + (inum1 != inum2)); // true
        System.out.println("inum1이 inum2보다 큰지 비교 : " + (inum1 > inum2));
        System.out.println("inum1이 inum2보다 크거나 같은지 비교 : " + (inum1 >= inum2));
        System.out.println("inum1이 inum2보다 작은지 비교 : " + (inum1 < inum2));
        System.out.println("inum1이 inum2보다 작거나 같은지 비교 : " + (inum1 <= inum2));

        //실수
        double dnum1 = 10.0;
        double dnum2 = 20.0;

        System.out.println();
        System.out.println("========== 실수값 비교 ==========");
        System.out.println("dnum1과 dnum2가 같은지 비교 : " + (dnum1 == dnum2)); //false
        System.out.println("dnum1과 dnum2가 같지 않은지 비교 : " + (dnum1 != dnum2)); // true
        System.out.println("dnum1이 dnum2보다 큰지 비교 : " + (dnum1 > dnum2)); // false
        System.out.println("dnum1이 dnum2보다 크거나 같은지 비교 : " + (dnum1 >= dnum2)); // false
        System.out.println("dnum1이 dnum2보다 작은지 비교 : " + (dnum1 < dnum2)); // true
        System.out.println("dnum1이 dnum2보다 작거나 같은지 비교 : " + (dnum1 <= dnum2)); //true

        //문자값 비교
        char ch1 = 'a'; // 97
        char ch2 = 'A'; // 65

        System.out.println();
        System.out.println("========== 문자값 비교 ==========");
        System.out.println("ch1과 ch2가 같은지 비교 : " + (ch1 == ch2)); //false
        System.out.println("ch1과 ch2가 같지 않은지 비교 : " + (ch1 != ch2)); // true
        System.out.println("ch1이 ch2보다 큰지 비교 : " + (ch1 > ch2)); // true
        System.out.println("ch1이 ch2보다 크거나 같은지 비교 : " + (ch1 >= ch2)); // true
        System.out.println("ch1이 ch2보다 작은지 비교 : " + (ch1 < ch2)); // false
        System.out.println("ch1이 ch2보다 작거나 같은지 비교 : " + (ch1 <= ch2)); //false

        // 드래그한 후 Alt j로 같은 값을 한 번에 바꿀 수 있음

        // 논리값 비교
        // ==와 !=는 비교가 가능하지만 대소 비교는 불가능하다

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println();
        System.out.println("========== 문자값 비교 ==========");
        System.out.println("bool1과 bool2가 같은지 비교 : " + (bool1 == bool2)); //false
        System.out.println("bool1과 bool2가 같지 않은지 비교 : " + (bool1 != bool2)); // true
 //       System.out.println("bool1이 bool2보다 큰지 비교 : " + (bool1 > bool2)); // true
 //       System.out.println("bool1이 bool2보다 크거나 같은지 비교 : " + (bool1 >= bool2)); // true
 //       System.out.println("bool1이 bool2보다 작은지 비교 : " + (bool1 < bool2)); // false
//        System.out.println("bool1이 bool2보다 작거나 같은지 비교 : " + (bool1 <= bool2)); //false

        // 문자열 비교
        // == 와 !=는 비교가 가능하지만 대소 비교는 불가능하다.
        String str1 = "java";
        String str2 = "java";

        System.out.println();
        System.out.println("========== 문자값 비교 ==========");
        System.out.println("str1과 str2가 같은지 비교 : " + (str1 == str2)); //false
        System.out.println("str1과 str2가 같지 않은지 비교 : " + (str1 != str2)); // true
//        System.out.println("str1이 str2보다 큰지 비교 : " + (str1 > str2)); // true
//        System.out.println("str1이 str2보다 크거나 같은지 비교 : " + (str1 >= str2)); // true
//        System.out.println("str1이 str2보다 작은지 비교 : " + (str1 < str2)); // false
//        System.out.println("str1이 str2보다 작거나 같은지 비교 : " + (str1 <= str2)); //false
        
        //java라는 단어가 아니라 주소를 비교하는 것. 주소가 달라야 하는 게 맞지만 jvm 안에 있는 문자열 상수 풀(한 번 썼던 문자를 효율적으로 쓰기 위해) 
        //문자열을 비교하는 경우가 생길 텐데 equals이라는 기능(a라는 문자열과 b라는 문자열이 같은지 비교해주는 기능)을 써야 제대로 비교하는 거고 지금은 주소열 비교
        
        int x = 10;
        int y = 11;
        
        boolean result = x <= y;
        System.out.println("result = " + result);



    }
}
