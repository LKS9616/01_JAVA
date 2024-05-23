package com.ohgiraffers.section3.abstraction;

public class Quiz {
    String name;
    private int age;
    String breed;

    public void setAge (int age) {
        if (age > 0) {
            this.age = age;
            System.out.println("해당 나이가 개의 나이로 변경됩니다.");
        }
        else {
            System.out.println("나이가 잘못 입력되어 0으로 출력됩니다.");
            this.age = 0;
        }
    }

    String author;
    int page;
    String book;
}
