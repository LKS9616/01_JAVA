package com.ogiraffers.section02.variable;

public class Application2 {
    public static void main(String[] args) {
        /*
         * 변수를 사용하는 방법
         * 1. 변수를 준비한다.(선언)
         * 2. 변수의 값을 대입한다. ( 값 대입 및 초기화)
         * 3. 변수를 사용한다.
         */
        int a = 0;
        // int a(선언) = 0 (값 할당, 초기화)

        /*
         * 자료형이란?
         *
         * 다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 컴파일러와 약속한 키워드
         * 예) int 자료형은 정수를 4byte만큼 읽어서 하나의 값으로 취급하겠다 라는 약속을 한 것이다.
         * 이러한 자료형은 기본자료형, 참조자료형으로 나누어진다.
         */

        // 기본자료형
        // 정수를 취급하는 자료형 4가지
        // byte bnum;->bnum이라고 한 변수에 byte라는 데이터를 넣겠다고 컴파일러와 약속
        byte bnum; // 선언
        bnum = 10; // 초기화
        // Bear bear; Bear는 타입, bear는 변수명->나중에 헷갈리므로 앞에 있는 게 타입이라고 기억해둘 것

        short snum; // 2byte
        int inum; // 4byte
        long lnum; // 8byte //모두 선언, 값은 넣지 않음

        // 실수를 취급하는 자료형 2가지
        float fnum; // 4byte
        double dnum; // 8byte

        // 문자를 취급하는 자료형
        char ch; // 2byte
        char ch2; // 2byte

        boolean isTrue; // 1byte

        // 참조형 자료형
        // 공간을 만들고 값을 바로 저장하는 게 아니라 주소값을 넣음. 공간들의 주소값을 문자열에 저장
        // 문자열을 저장할 때는 String을 쓸 수 있다 정도로 알고 넘어가면 됨

        String str; // ctrl 누르고 누르면 라이브러리 볼 수 있음

        // 여기까지는 선언만 했으니 초기화 과정

        // 초기화

        /*
         * 초기화
         *
         * 초기화 할 때 대입연산자 기준 오른쪽과 왼쪽은 무조건 같은 타입이어야 한다.
         * */

        //초기화하지 않고 그대로 실행할 경우 초기화하라는 알람이 뜸

        bnum = 1; // 초기화
        snum = 2;
        inum = 4;
        lnum = 8; // 8의 경우 int가 기본자료라 오류가 나올 거라 생각하지만 컴파일러가 자동으로 변환해줌. 사실 형변환을 위해 대문자 L을 붙여야 한다.
        lnum = 8L; // 권장되는 방식

        fnum = 4.0f; // 실수 뒤에 'f'를 붙여야 한다.
        dnum = 8.0; //double은 기본자료라 d를 써도 안 써도 됨
        ch = 'a'; // 문자형식으로 저장 가능
        ch2 = 97; // 숫자로도 저장 가능합니다.

        // java는 괄호 안에서 코드를 작성해야 하고 클래스마다 메인 메소드가 하나씩 있어서 그걸 중심으로 실행됨. 메인 메소드가 가장 먼저 실행
        // 그래서 기본적인 부분을 알기 위해 메인 메소드 안에서 작성함(코드작성시 메인메소드-괄호 안에서 작성할 것)

        isTrue = true; // true 혹은 false 중 한 가지의 값만 사용 가능하다.
        isTrue = false; // 문자나 숫자가 들어가면 에러가 뜸

        // 이 시점에서 isTrue 값은 false

        str = "안녕하세요";

        // 선언과 동시에 초기화하기
        int point = 100;
        System.out.println("========== 변수에 저장된 값 출력 ==========");
        System.out.println("bnum의 값 : " + bnum);
        System.out.println("snum의 값 : " + snum);
        System.out.println("inum의 값 : " + inum);
        System.out.println("lnum의 값 : " + lnum);

        System.out.println("fnum의 값 : " + fnum);
        System.out.println("dnum의 값 : " + dnum);

        System.out.println("ch의 값 : " + ch); // 문자 형식으로 초기화했던 변수 'a'
        System.out.println("ch2의 값 : " + ch2); // 숫자 형식으로 초기화 했던 변수 97
        // 숫자 형식이었는데도 문자 형식의 a로 출력됨

        System.out.println("isTrue의 값 : " + isTrue);

        // tab 사용으로 줄 관리
        // ctrl alt l

        System.out.println("str의 값 : " + str);

        // '=' 대입연산자
        // 대입연산자의 왼편에는 공간이라는 의미가 있고, 오른편은 값이라는 의미가 있다.
        // soutv 단축키 기억,
        point = point + 10;
        System.out.println("point = " + point);
        System.out.println(point); // 10
        System.out.println("str = " + str);




    }
}
