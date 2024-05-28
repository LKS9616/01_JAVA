package com.ohgiraffers.section03.user2;

public class DatabaseSaveProvider implements SaveProvider{

    @Override
    public boolean save(String data) {
        System.out.println("Database에 저장 성공했습니다.");
        return false;
    }
}
