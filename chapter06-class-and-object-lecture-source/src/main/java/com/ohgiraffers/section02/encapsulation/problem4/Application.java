package com.ohgiraffers.section02.encapsulation.problem4;

public class Application {

    public static void main(String[] args) {
        Monster monster1 = new Monster();

        // 컴파일에러 이유: kinds 필드는 private으로 접근 제한이 되어 있기 때문에 필드로 직접 접근이 안 된다.

//        monster1.kinds = "??";
//        monster1.hp = 10;

        monster1.setKinds("프랑켄슈타인");
        monster1.setHp(200);

        System.out.println(monster1.getInfo());

        // 유지보수성을 증가시키기 위해 캡슐화가 기본 원칙으로 앞으로도 사용됨

        /*
        * 클래스 작성시, 특별한 목적이 아닌 경우 캡슐화가 기본 원칙으로 사용된다.
        * */
    }
}
