package com.ohgiraffers.section03.user2;

public class Application {
    public static void main(String[] args) {

            SaveProvider saveProvider = new DatabaseSaveProvider();

            Person person = new Person(saveProvider);

            person.doSomething();

        }
    }

