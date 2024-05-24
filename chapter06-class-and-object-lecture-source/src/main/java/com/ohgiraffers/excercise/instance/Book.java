package com.ohgiraffers.excercise.instance;


//**문제 설명:**
//
//Joshua Bloch가 쓴 "Effective Java" 책을 만들고, 416페이지이며 하드커버인 책 객체를 생성하여 값을 출력하세요.
//
//책의 공통 속성
//
//- 저자
//- 책이름
//- 페이지수
//- 커버의 종류
//

public class Book {
    private String bookauthor;
    private String bookname;
    private int bookpages;
    private String cover;

    public Book() {
    }

    public Book(String bookauthor, String bookname, int bookpages, String cover) {
        this.bookauthor = bookauthor;
        this.bookname = bookname;
        this.bookpages = bookpages;
        this.cover = cover;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public void setBookpages(int bookpages) {
        if(bookpages > 0 ) {
            this.bookpages = bookpages;
        } else {
            this.bookpages = Math.abs(bookpages);
        }
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public String getBookname() {
        return bookname;
    }

    public int getBookpages() {
        return bookpages;
    }

    public String getCover() {
        return cover;
    }

    public String getBookInfo() {
        return "이 책의 이름은 " + this.bookname + "이고, 책의 저자는 " + this.bookauthor + "이며, 책의 페이지수는 " + this.bookpages + "페이지이고 책의 종류는 " + this.cover + "이다.";
    }

}
