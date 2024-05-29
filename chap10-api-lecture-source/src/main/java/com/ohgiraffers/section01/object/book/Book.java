package com.ohgiraffers.section01.object.book;

import java.util.Objects;

public class Book {

    private int number;
    private String title;
    private String author;
    private int prices;

    public Book() {
    }

    public Book(int number, String title, String author, int prices) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.prices = prices;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrices() {
        return prices;
    }

    public void setPrices(int prices) {
        this.prices = prices;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", number=" + number +
                ", title='" + title + '\'' +
                ", prices=" + prices +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        // 두 인스턴스의 주소가 같으면 true
        if (this == obj) return true;
        // 매개변수가 null이거나 매개변수로 받아온 obj와 비교했을 때 타입이 같지 않으면 false
        if (obj == null || getClass() !=obj.getClass()) return false;
        // 다른 필드들을 비교해서 같지 않으면 false, 같으면 true
        Book book = (Book) obj;
        return this.number == book.number &&
                this.prices == book.prices &&
                this.author.equals(book.author) &&
                this.title.equals(book.title);
    }

    @Override
    public int hashCode() {
        // 곱셈연산으로 누적을 하기 위해
        int result = 1;

        // 31이 소수이기 대문에 연산할 때 동일한 hashCode 값이 나오지 않을 확률을 증가시킨다.
        // 31 하는 게 관계
        final int PRIME = 31;

        // 각각의 필드값이 같으면 같은 hashCode 값을 나오게 만듦
        result = PRIME * result + this.number;
        result = PRIME * result + this.title.hashCode();
        result = PRIME * result + this.author.hashCode();
        result = PRIME * result + this.prices;

        return result;
    }
}
