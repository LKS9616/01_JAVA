package com.ohgiraffers.excercise.instance;

public class Dog {

    // 이름, 나이, 중
    private String name;
    private String kinds;
    private int age;

    // 이름 설정하는 메소드
    public void setName(String name) {
        this.name = name;
    }

    // 나이 설정하는 메소드
    public void setAge(int age) {

        if (age > 0) {
            this.age = age;
        } else {
            this.age = Math.abs(age); //절대값
        }

    }

    // 종 설정하는 메소드
    public void setKinds(String kinds) {
        this.kinds = kinds;
    }

    public String getInfo() {
        return "이 개의 이름은 " + this.name + "이며, 나이는 " + this.age + "세이고, 종은 " + this.kinds + "입니다.";


    }



}
