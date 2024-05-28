package com.ohgiraffers.section02.abstractclass;

public class Smartphone extends Product /*java.util.Scanner*/{

    @Override
    public void abstMethod(){

        System.out.println("Product 클래스의 abstMethod를 오버라이딩한 메소드 호출함...");
    }

    public void printSmartPhone(){
        System.out.println("SmartPhone 클래스의 printSmartPhone을 ");
    }
}

// 자바에서는 단일상속만 가능
