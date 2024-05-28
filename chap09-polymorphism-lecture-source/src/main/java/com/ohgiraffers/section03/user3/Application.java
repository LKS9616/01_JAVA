package com.ohgiraffers.section03.user3;

public class Application {
    public void main(String[] args) {

        Dice dice = new HellDice(); // SuperDice로 변경해도 작동되게

        Dicer dicer = new Dicer();

        dicer throwDice(dice);
    }
}
