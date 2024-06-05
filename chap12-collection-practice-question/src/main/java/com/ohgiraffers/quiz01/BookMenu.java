package com.ohgiraffers.quiz01;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BookMenu {

    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();

    public BookMenu() {

    }
    public void Menu() {

    }

    public static void main(String[] args) {
        System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("ss:mm:HH")));
        Set<Integer> lottery = new TreeSet<>();
        while(lottery.size() < 6) {
            lottery.add((int) ((Math.random() * 45) + 1));
        }
        System.out.println("lottery = " + lottery);


    }


}



