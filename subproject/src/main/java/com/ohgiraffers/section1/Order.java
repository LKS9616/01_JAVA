package com.ohgiraffers.section1;

public class Order { // 스크롤 후 Alt enter로 없는 클래스 생성

    private final String menuName; // 커피 종류
    private final String option; // HOT or ICE.
    private int count; // 수량

    // final 객체는 한 번 초기화하면 바꿀 수 없음.

    public Order(String menuName, String option, int count) {
        this.menuName = menuName;
        this.option = option;
        this.count = count;
    }

    public String getMenuName() {
        return menuName;
    }

    public String getOption() {
        return option;
    }

    public int getCount() {
        return count;
    }

}
