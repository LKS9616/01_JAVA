package com.ohgiraffers.section01.intenum;

public class Application {
    public static void main(String[] args) {

        /*
        * Enum(열거타입)
        * 제한된 값 목록이 필요한 경우 사용한다.
        *
        * 이넘이란 관련이 있는 상수의 집합의 클래스를 의미한다.
        * 각각의 열거 상수는 열거 객체로 생성된다.
        * 기존의 상수를 정의하느느 방법을 효과적으로 대체한다.
        *
        * 기존 정수 열거 패턴의 단점
        * 1. 정수형 상수는 의미가 있는 문자열로 출력하기 어렵다.
        * 2. 정수 열거 그룹에 속한 상수들을 순회할 수 없다.(갯수 확인도 불가능)
        * 3. 타입의 안전을 보장할 수 없다.
        * */

        int subject1 = Subjects.JAVA;
        int subject2 = Subjects.HTML;

        if(subject1 == subject2) {
            System.out.println("두 과목은 같은 과목입니다.");
        }

        // 2. 문자열로 출력하기가 까다롭다.
        int num = 0;
        String subjectText = "";

        // switch문을 int를 매개변수로 입력받고 return 없고, 과목명을 출력하는 메소드
        // public static, publicSubject(){}


        switch(num) {
            case Subjects.JAVA: subjectText = "JAVA"; break;
            case Subjects.JDBC: subjectText = "JDBC"; break;
            case Subjects.ORACLE: subjectText = "ORACLE"; break;
        }
        System.out.println("subjectText = " + subjectText);

        // 3. 타입 안전을 보장할 수 없다.
        printSubject(5);
        // 타입이 고정되지 않음.

        }

    public static void printSubject (int subjectNumber) {

        String subject = "";

        switch(subjectNumber) {
            case Subjects.JAVA: subject = "JAVA"; break;
            case Subjects.JDBC: subject = "JDBC"; break;
            case Subjects.ORACLE: subject = "ORACLE"; break;
        }
        System.out.println("subjectText = " + subject);



    }
    }

