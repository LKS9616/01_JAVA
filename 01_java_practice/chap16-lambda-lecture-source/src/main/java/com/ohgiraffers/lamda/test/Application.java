package com.ohgiraffers.lamda.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.*;

public class Application {
    public static void main(String[] args) {

        Application app = new Application();
        app.test1();
        app.testGeneral1();
        app.test2();
        app.testGeneral2();
        app.test3();
        app.testGeneral3();
        app.test4();
        app.test4_1();
        app.test5();
        app.test5_General();


    }
    private void test1() {

        // 방법 1 Runnable
        Runnable now = () -> {
            System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        };
        now.run();

        // 방법 2 Consumer
        Consumer<LocalTime> now2 = (time) -> {
            System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        };
        now2.accept(LocalTime.now());

//        BiConsumer<String, LocalTime> biConsumer = (str, time) -> System.out.println(str + "은 " + time + "이다.");
//        biConsumer.accept("현재 시각", LocalTime.now());

    }
    private void testGeneral1() {
        // 현재시간을 시 분 초로 출력하는 람다식
        // 메소드 만들기

        LocalTime localtime = LocalTime.now();
        System.out.println(localtime);

        System.out.println(localtime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        //매개변수도 필요없음
        // 리턴도 필요없음
        // Runnable<< 실행만 시킴
        // Consumer -> 시간도 넘겨줌
    }

    private void test2() {
        // IntSupplier lottery = () -> (int) (Math.random() * 45 ) + 1;
        // System.out.println("로또 번호는 " + lottery.getAsInt() + "입니다.");

        Supplier<Set<Integer>> lotto = () -> {
            Set<Integer> set = new TreeSet<>();
            while(set.size() < 6) {
                set.add((int) ((Math.random() * 45) + 1));
            }
            
            return set;
            
        };
        
        Set<Integer> lottoResult = lotto.get();

        System.out.println("lottoResult = " + lottoResult);

        }
    private void testGeneral2() {
        // 중복되는 수 없이 1-45 사이의 숫자가 여섯 개
        // 리턴타입 set int
        // Set 특징: 중복저장이 허용되지 않음
        // TreeSet: 자동정렬
        // 컬렉션 -> 컬렉션에서 다룰 수 있는 데이터는 기본적으로 객체만 가능 -> Integer를 사용한 이유

        Set<Integer> lotto = new TreeSet<>();
        // 숫자 6개
//        int num = (int) ((Math.random() * 45) + 1);
//        System.out.println(num);
        
        // 반복문
        while(lotto.size() < 6) {
            lotto.add((int) ((Math.random() * 45) + 1));
        }

        System.out.println("lotto = " + lotto);
    }

    private void test3() {
//        IntConsumer intConsumer = (num) -> System.out.println("입력하신 원화를 달러로 환산하면 " + (num / 1350) + "달러입니다.");
//        intConsumer.accept(15000);

        Consumer<Integer> calc = won -> {
            double rate = 1300;
            double dollar = won / rate;
            System.out.println("￦" + won + " => $" + dollar);
        };


    }
    private void testGeneral3 () {

        //입력받을 값
        int won = 3000;

        //환율
        double rate = 1300;

        //달러로 환산
        double dollar = won / rate;

        //출력
        System.out.println("￦" + won + " => $" + dollar);

    }

    private void test4() {

        Function<Integer, Double> calc = won -> {
            double rate = 1300;
            return won / rate;
        };

        double dollar = calc.apply(3000);
        System.out.println(dollar);
    }
    private void test4_1() {

        BiFunction<Integer, Double, Double> biFunction = (won, rate) -> {
            return won / rate;
        };

        double dollar = biFunction.apply(3000, 1300.0);

        int won = 3000;
        double rate = 1300;;
        System.out.println("dollar = " + dollar);

    }

    private void test5() {
        List<String> strList = Arrays.asList("abc", "", "대한민국", "   ");

        Predicate<String> isLengthZero = str -> str.trim().length() == 0;

        for (String str : strList){
            System.out.println("[" + str + "]의 결과는 0입니까?" + isLengthZero.test(str));
        }
    }

    private void test5_General() {

        // List를 만드는 방법 1
        List<String> strList1 = new ArrayList<>();
        strList1.add("abc");
        strList1.add("");
        strList1.add("대한민국");
        strList1.add("    ");

        // List를 만드는 방법 2
        // Arrays.asList() : 나열된 값을 리스트로 만들어준다.
        // asList()로 만든 리스트의 경우, 컬렉션 프레임워크가 아닌 Arrays 클래스 내부의 static inner class로 만들어진다 -> 추가, 삭제 불가능 / 변경만 가능
        List<String> strList2 = new ArrayList<>(Arrays.asList("abc", "", "대한민국", "   "));
        List<String> strAsListTest = Arrays.asList("1", "2");
//        strAsListTest.add("3"); // unsupportedOperationException 발생
//        strAsListTest.clear(); // unsupportedOperationException 발생

        // List를 만드는 방법 3
        // List.of() : 팩토리메소드, 나열된 값을 리스트로 만들어준다.
        // List.of()로 만든 리스트는 ImmutableCollection 객체의 내부 클래스인 ListN 클래스로 List를 생성
        // 추가, 삭제 불가능/ 변경만 가능하다.
        List<String> strListOfTest = new ArrayList<>(List.of("1", "2"));
        // strListOfTest.add("3"); // unsupportedOperationException 발생
//        strListOfTest.clear();
        List<String> strList3 = new ArrayList<>(List.of("abc", "", "대한민국", "   "));

        /*
        * List.of(), Arrays.asList() -> 추가, 삭제 불가능하게 한 이유
        * 불변객체이어야 다른 컬렉션으로 변환이 용이하기 때문
        * */

        // 공백을 제외한 문자열의 길이가 0인지 판단
        for(String str : strList1) {
            // 문자열을 trim() -> 공백을 앞뒤로 다 지우는 기능

            Boolean isLengthZero = str.trim().length() == 0;

            System.out.println("[" + str + "]의 길이는 0입니까?" + isLengthZero);
        }


    }


}
