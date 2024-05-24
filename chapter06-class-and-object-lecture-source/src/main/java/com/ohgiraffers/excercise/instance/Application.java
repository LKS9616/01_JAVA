package com.ohgiraffers.excercise.instance;

public class Application {

    public static void main(String[] args) {

        // 이름이 MAX이고 5살이며 골든 리트리버 종인 강아지를 표현하는 클래스를 만들고, 객체를 생성하여 값을 출력하세요.
        //
        // 객체를 생성하여 값을 출력하세요.

        Dog dog = new Dog();
        dog.setName("Max");
        dog.setAge(-5);
        dog.setKinds("골든 리트리버");

        System.out.println(dog.getInfo());

        Book book = new Book("Joshua Bloch", "Effective Java", 497, "hardcover");
        System.out.println(book.getBookInfo());
        Book book1 = new Book();
        book1.setBookauthor("Joshua Bloch");
        book1.setBookname("Effective Java");
        book1.setBookpages(-497);
        book1.setCover("hardcover");
        System.out.println(book1.getBookInfo());

        Car car = new Car("Tesla Model S", 2022, "electric motor");
        System.out.println(car.getCarInfo());
        Car car1 = new Car();
        car1.setEngine("electric motor");
        car1.setModel("Tesla Model S");
        car1.setModelyear(2022);
        System.out.println(car1.getCarInfo());

        Man man1 = new Man();
        man1.setAge(30);
        man1.setName("James");
        man1.setGender("Male");
        man1.setIsmarried(true);
        man1.setChildrennumber(3);
        System.out.println(man1.setManInfo());
        Man man = new Man(30, "James", "Male", true, 3);

        Notebook notebook = new Notebook();
        notebook.setNotebookBrand("Dell");
        notebook.setNotebookNodel("XPS 13");
        notebook.setRamVolume(16);
        notebook.setSsdVolume(512);
        System.out.println(notebook.setNotebookInfo());
        Notebook notebook1 = new Notebook("Dell", "XPS 13", 16, 512);

    }
}
