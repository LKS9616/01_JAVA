package com.ohgiraffers.section03.user3;

public class SuperDice implements Dice{
    @Override
    public int getNumber() {
        int min = 0;
        int max = 10;
        return (int)(Math.random() * 10) + 1;
    }
}
