package com.ohgiraffers.section03.interfaceimplements;

public class Application {

    // interface에 대해 이해
    public static void main(String[] args) {
        /*
        * 인터페이스(interface)
        * 자바의 클래스와 유사한 형태지만, 추상 메소드와 상수 필드만 가질 수 있는 클래스의 변형체
        * */

        /*
        * 인터페이스의 사용목적
        * 1. 추상 클래스와 비슷하게 필요한 기능을 공통화해서 강제성을 부여할 목적으로 사용한다.(표준화)
        * 2. 자바의 단일상속의 단점을 극복할 수 있다.(다중 상속)
        * */

        // 인스턴스를 직접 생성하지 못하고 생성자 자체가 존재하지 않는다.
        // InterProduct interProduct = new InterProduct();
        InterProduct interProduct = new Product();

    }
}
