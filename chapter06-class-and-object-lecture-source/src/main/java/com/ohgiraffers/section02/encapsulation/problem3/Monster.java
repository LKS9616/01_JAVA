package com.ohgiraffers.section02.encapsulation.problem3;

public class Monster {
    String kinds;
    String name;
    int hp;

    public void setInfo(String info) {
        this.kinds = info;
        this.name = info;
    }
    public void setHp(int hp) {
        if (hp > 0) {
            this.hp = hp;
        }
        else {
            this.hp = 0;
        }

    }
    // 몬스터의 이름과 체력을 String 값으로 return해주는 기능
    public String getInfo() {

        String text = "몬스터의 종족은 " + this.kinds + "이고, 이름은 " + this.name + "이며, 체력은 " + this.hp + "입니다.";
        return text;
    }
}
