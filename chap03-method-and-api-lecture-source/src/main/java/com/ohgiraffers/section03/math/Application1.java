package com.ohgiraffers.section03.math;

public class Application1 {
    public static void main(String[] args) {
        /*
        * API
        *
      * Application Programming Interface 는 프로그램에서 사용할 수 있도록 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스를 뜻함
        * 쉽게 말해 우리가 구현할 수 없거나 구현하기 번거로운 기능들을 JDK를 설치하면 자동으로 사용할 수 있도록 제공해놓은 소스코드(클래스나 인터페이스)를 의미한다.
        * => 누군가가 작성해놓은 소스코드이니 가져다 쓰는 방법을 본다는 말.
        * 구글링을 해도 막힐 때 공식문서를 이용할 수 있음
         */

        /*
        * java.lang.Math
        *
        * Math 클래스는 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해놓은 클래스이다.
        * 모든 메서드는 static 메소드로 작성되어 있다.
         */

        System.out.println("-7의 절대값 : " + (java.lang.Math.abs(-7)));

    //java.lang은 자주 사용되어서 컴파일러가 import java.lang.*(*는 와일드 카드처럼 어떤 단어가 들어와도 import 해준다는 뜻)을 미리 실행시켜 줌

        System.out.println("-1.25의 절대값" + Math.abs(-1.25));

        //최대값 최소값
        System.out.println("10과 20 중 더 작은 것은 ? : " + Math.min(10, 20));
        System.out.println("20과 30 중 더 큰 것은 ? : " + Math.max(20, 30));

        System.out.println("원주율 : " + Math.PI);

        //난수
        /*
        * 0부터 1 이전까지의 실수 형태의 난수를 발생시킨다.
        * 호출할 때마다 다른 값을 가진다.
        *
        * 원하는 범위의 난수를 구하는 공식
        * (int) (Math.random * 구하려는 난수의 개수) + 구하려는 난수의 최소값
         */

        // 난수의 범위 0 ~ 9
        int random1 = (int) (Math.random() * 10);
        System.out.println("0에서 9까지의 난수 생성 : " + random1);

        int random2 = (int) (Math.random() * 10) + 1;
        System.out.println("1 ~ 10까지의 난수 생성 : " + random2);

        // 10 ~ 15 사이의 난수 발생

        int random3 = (int) (Math.random() * 6) + 10;
        System.out.println("10 ~ 15 사이의 난수 발생 = " + random3);

        // -128 ~ 127 사이의 난수 발생

        int random4 = (int) (Math.random() * 256) -128;
        System.out.println("-128 ~ 127 사이의 난수 발생 = " + random4);




    }
}
