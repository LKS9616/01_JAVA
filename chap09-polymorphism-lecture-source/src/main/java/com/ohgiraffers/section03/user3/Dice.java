package com.ohgiraffers.section03.user3;

public interface Dice {
    public default int getNumber() {
        return (int)(Math.random() * 6) + 1;
    }
}
