package com.ohgiraffers.section06.time;

import java.time.*;

public class Application1 {
    
    // time 패키지 => Date, Calendar가 가지고 있는 단점을 해소하기 위해 탄생
    public static void main(String[] args) {
        /*
        * LocalTime, LocalDate, LocalDateTime, ZonedDateTime 클래스롤이 있다.
        * */
        
        /*
        * LocalTime
        * 시간을 표현하는 클래스
        * - 시, 분, 초, 나노초
        * - 날짜 정보를 포함하지 않는다.
        * - 14:30:15:123
        * */
        LocalTime timeNow = LocalTime.now();
        System.out.println("timeNow = " + timeNow);
        LocalTime timeOf = LocalTime.of(15,25,1);
        System.out.println("timeOf = " + timeOf);
        
        /*
        * LocalDate
        * 날짜를 표현하는 클래스
        * - 연도, 월, 일
        * 시간정보를 포함하지 않는다.
        * - 2023-05-29
        * */
        LocalDate dateNow = LocalDate.now();
        System.out.println("dateNow = " + dateNow);
        
        LocalDate dateOf = LocalDate.of(2024, 5, 29);
        System.out.println("dateOf = " + dateOf);
        
        /*
        * ZoneDateTime
        * 날짜와 시간, 시간대를 함께 표시하는 클래스
        * - 연도, 월, 일, 시, 분, 초, 시간대
        * - 2024-05-29T14:30:153+02:00[Asia/Seoul]
        * */
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime = " + zonedDateTime);
        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(dateOf, timeOf, ZoneId.of("Asia/Seoul"));
        
        /*
        * LocalDateTime
        * 날짜와 시간을 함께 표현하는 클래스
        * - 연도, 월, 일, 시, 분, 초, 나노초
        * -2024-05-29T14:30:15.123
        * */
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println("dateTimeNow = " + dateTimeNow);
        LocalDateTime LocalDateTimeOf = LocalDateTime.of(2024, 5, 29, 10, 10, 10, 10);
        System.out.println("LocalDateTimeOf = " + LocalDateTimeOf);
        
    }
}
