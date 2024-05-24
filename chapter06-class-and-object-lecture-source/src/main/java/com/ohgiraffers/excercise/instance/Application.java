package com.ohgiraffers.excercise.instance;

public class Application {

    public static void main(String[] args) {

        // 이름이 MAX이고 5살이며 골든 리트리버 종인 강아지를 표현하는 클래스를 만들고, 객체를 생성하여 값을 출력하세요.
        //
        // 객체를 생성하여 값을 출력하세요.

        Dog dog = new Dog();
        dog.setName("Max");
        dog.setAge(-5);
        dog.setKinds("골든 리트리버");

        System.out.println(dog.getInfo());
    }
}
