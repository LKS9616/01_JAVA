package com.ohgiraffers.excercise.instance;

public class Man {
    //**문제 설명:**
//
//나이가 30살이고 이름이 James인 남자가 있습니다. 이 남자는 결혼을 했고 자식이 셋 있습니다. 이를 표현하는 클래스를 만들고, 객체를 생성하여 값을 출력하세요.
//
//        남자
//
//- 나이
//- 이름
//- 성별
//- 결혼유무
//- 자식
//
    private int age;
    private String name;
    private String gender;
    private boolean ismarried;
    private int childrennumber;

    public Man () {}

    public Man(int age, String name, String gender, boolean ismarried, int childrennumber) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.ismarried = ismarried;
        this.childrennumber = childrennumber;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public boolean isIsmarried() {
        return ismarried;
    }

    public int isChildrennumber() {
        return childrennumber;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = Math.abs(age);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setIsmarried(boolean ismarried) {
        this.ismarried = ismarried;
    }

    public void setChildrennumber(int childrennumber) {
        this.childrennumber = childrennumber;
    }

    public String setManInfo() {
        return "이 사람의 이름은 " + this.name + "이며, 성별은 " + this.gender + "이고, 결혼 여부는 " + this.ismarried + "이며. 아이의 수는 " + this.childrennumber + "이다.";
    }

}
