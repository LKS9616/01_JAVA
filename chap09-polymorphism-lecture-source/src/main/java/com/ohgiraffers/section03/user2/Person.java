package com.ohgiraffers.section03.user2;

public class Person {

    private SaveProvider saveProvider;
    private DatabaseSaveProvider databaseSaveProvider;
    private FileSaveProvider fileSaveProvider;

    public Person(SaveProvider saveProvider){
        this.saveProvider = saveProvider;
    }

    public void doSomething(){

        String data = "문자열 데이터";

        saveProvider.save(data);
    }
    public void doSomethingByFileSaveProvider() {

        String data = "문자열 데이터";

        fileSaveProvider.save(data);
    }

    public void doSomethingByDatabaseSaveProvider() {

        String data = "문자열 데이터";

        databaseSaveProvider.save(data);
    }
}