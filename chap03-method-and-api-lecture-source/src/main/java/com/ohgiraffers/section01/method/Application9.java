package com.ohgiraffers.section01.method;

public class Application9 {
    public static void main (String[] args) {
        /* 다른 클래스에서 작성한 메소드 호출 */

        int first = 100;
        int second = 50;
        /*
         * 사용방법
         * [클래스명] [사용할 이름] = new [클래스명]();
         *
         * 사용
         * [사용할 이름].[메소드명]();
         *
         * */
        Calculator calc = new Calculator();
        int min = calc.nonStaticMinNumberOf(first, second);

        System.out.println("두 수 중 최소 값은 : " + min);

        /*
        * static 메서드의 사용방법
        *
        * [클래스명].[메소드명]();
         */

        int max = Calculator.staticMaxNumberOf(first, second);
        Application4 app4 = new Application4();


        System.out.println("두 수 중 최대 값은 : " + max);

        // non static의 경우 class를 참조해서 값을 만듬(인스턴스)
        //static으로 만들 경우 인스턴트를 만들지 않아도 메서드가 할당되어 있기 때문에 바로 사용할 수 있지만 class를 지정해줘야 함

        // int max2 = calc.staticMaxNumberof(first, second);->사용할 수 있지만 권장되지 않음
        // System.out.println("두 수 중 최대 값은 : " +max2);
    }
}
