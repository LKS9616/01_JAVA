package com.ogiraffers.section3.overflow;

public class Application {
    public static void main(String[] args)  {
        // byte num1 = 127;
        // num1 = num1 +1;
        // 맨 끝 자리수는 부호비트라고 해서 0이면 플러스고 1이면 마이너스, -128에서 127까지 표현되기 때문에 128이 되면 -128이 됨
        // = 데이터 오버플로우 발생

        /*
        *
        * 자료형 별 값의 최대 범위를 벗어나는 경우
        * 발생한 carry를 버림처리하고 sign bit를 반전시켜 최소값을 순환시킨다
        * */

        byte num1 = 127;
        System.out.println("num1 = " + num1);
        // 후위 증감 연산자는 원래 있던 값에 1 더해줌. 바이트는 127까지밖에 표현할 수 있는데
        num1++; // 오버플로우 발생
        //  127 -> -128
        System.out.println("num1 overflow = " + num1);

        // 기억해야 할 것
        // 타입이 정해진 값을 넘어가게 되면 오버플로우가 발생한다.
        // 오버플로우가 발생하면 최대값이 최소값이 된다.

        /*
        * 언더플로우
        *
        * 오버플로우와 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상이다.
        * */

        byte num2 = -128; // 바이트 최소 저장범위

        System.out.println("num2 = " + num2);

        num2--; // --는 빼는 역할

        System.out.println("num2 underflow= " + num2); // 127( 그 이상을 저장할 수 없음)

        int firstNum = 1000000;
        int secondNum = 700000; // int 최대 약 21억

        int multi = firstNum * secondNum; // 칠천억
        System.out.println("multi = " + multi); // -79669248

        /*
        * 해결방법
        *
        * 오버플로우를 예측하고 더 큰 자료함으로 결과 값을 받아서 처리한다.
        * */

        long longMulti = firstNum * secondNum;

        System.out.println("longMulti = " + longMulti);

        // long * long = long, int * int = int

        longMulti = (long) firstNum * secondNum; // 강제 형변환

        //Sourcetree 이용해서 집에서도 파일 버전 맞추는 법:

        //새 탭 클릭->github 링크 이용해서 클로닝. 탐색기 클릭해서 폴더로 이동->인텔리제이 오픈 클릭해서 폴더 열어주기->

        //pull을 하는 조건은 컴퓨터에서 바뀐 내용이 커밋되어 있어야 함(충돌이 있는지 없는지 확인










    }
}
