package com.ohgiraffers.section03.grammar;

public enum UserRole1 {

    // Enum은 상수 하나하나가 인스턴스화될 수 있다.
    GUEST,
    CONSUMER,
    PRODUCER,
    ADMIN,

    /*
    * 기본 생성자를 가질 수 있다.
    * defualt와 private 접근제한 사용 가능하지만, 외부에서 호흡은 불가능(묵시적으로 private)
    * Enum 타입은 고정된 상수들의 집합으로, 런타임이 아닌, 컴파일시에 모든 값이 결정되어 있어야 한다.
    * 생성자를 가질 시, 열거형 상수 선언 마지막에 세미콜론을 붙여야 한다.
    * */

    UserRole() {};

    public String getNameToLowerCase(){
        return this.name().toLowerCase();

    }
}
