package com.ohgiraffers.excercise.instance;
//**문제 설명:**
//Dell 브랜드의 XPS 13 모델이고, 16GB RAM과 512GB SSD를 가진 노트북을 표현하는 클래스를 만들고, 객체를 생성하여 값을 출력하세요.
//
//노트북
//
//- 브랜드
//- 모델명
//- 램용량
//- SSD용량

public class Notebook {
    private String notebookBrand;
    private String notebookModel;
    private int ramVolume;
    private int ssdVolume;
public Notebook() {}
    public Notebook(String notebookBrand, String notebookModel, int ramVolume, int ssdVolume) {
        this.notebookBrand = notebookBrand;
        this.notebookModel = notebookModel;
        this.ramVolume = ramVolume;
        this.ssdVolume = ssdVolume;
    }

    public void setNotebookBrand(String notebookBrand) {
        this.notebookBrand = notebookBrand;
    }

    public void setNotebookNodel(String notebookModel) {
        this.notebookModel = notebookModel;
    }

    public void setRamVolume(int ramVolume) {
        if(ramVolume > 0 ) {
            this.ramVolume = ramVolume;
        } else {
            this.ramVolume = Math.abs(ramVolume);
        }
    }

    public void setSsdVolume(int ssdVolume) {
        if(ssdVolume > 0 ) {
            this.ssdVolume = ssdVolume;
        } else {
            this.ssdVolume = Math.abs(ssdVolume);
        }
    }

    public String getNotebookBrand() {
        return notebookBrand;
    }

    public String getNotebookNodel() {
        return notebookModel;
    }

    public int getRamVolume() {
        return ramVolume;
    }

    public int getSsdVolume() {
        return ssdVolume;
    }
    public String setNotebookInfo(){
        return "노트북의 브랜드는 " + this.notebookBrand + "이며, 모델은 " + this.notebookModel + "이고, 램의 용량은 " + this.ramVolume + "이며, SSD의 용량은 " + this.ssdVolume + "이다.";
    }
}
