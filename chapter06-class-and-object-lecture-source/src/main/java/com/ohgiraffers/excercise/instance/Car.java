package com.ohgiraffers.excercise.instance;

public class Car {
    //**문제 설명:**
//
//Tesla Model S를 만들고 2022년식이며 전기차인 자동차 객체를 생성하여 값을 출력하세요.
//
//        자동차
//
//- 모델명
//- 연식
//- 엔진
//


    private String model;
    private int modelyear;
    private String engine;

    public Car() {}

    public Car(String model, int modelyear, String engine) {
        this.model = model;
        this.modelyear = modelyear;
        this.engine = engine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setModelyear(int modelyear) {
        if (modelyear >= 0) {
            this.modelyear = modelyear;
        } else {
            this.modelyear = Math.abs(modelyear);
        }
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public int getModelyear() {
        return modelyear;
    }

    public String getEngine() {
        return engine;
    }
    public String getCarInfo () {
        return "이 차의 모델은 " + this.model + "이고, 연식은 " + this.modelyear + "년식이며, 엔진은 " + this.engine +  "이다.";
    }
}
