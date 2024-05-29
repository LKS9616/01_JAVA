package com.ohgiraffers.section03.user3;

public class SuperDice implements Dice{

    private int min;
    private int max;

    @Override
    public int getNumber() {
        int num = (int) ((Math.random() * 10) + 1);
        return num;
    }
// 매개 변수가 없음. 개발생성자,
    public SuperDice() {
        this.max = 10;
        this.min = 0;
    }

    // 매개

    //    @Override
//    public int getNumber() {
//        int min = 0;
//        int max = 10;
//        return (int)(Math.random() * 10) + 1;
//    }


}
