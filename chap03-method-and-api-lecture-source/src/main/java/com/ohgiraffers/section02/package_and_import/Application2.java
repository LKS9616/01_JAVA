package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Application5;
import com.ohgiraffers.section01.method.Calculator;

import static com.ohgiraffers.section01.method.Calculator.staticMaxNumberOf;

public class Application2 {
    public static void main(String[] args) {

        /*
        * 임포트
        *
        * 서로 다른 패키지에 존재하는 클래스를 사용하는 경우, 패키지명을 포함한 풀 클래스 이름을 사용해야 하지만 너무 길다.
        * 그래서 패키지명을 생략하고 사용할 수 있도록 한 구문이 import 구문이다.
         */

        Calculator calculator = new Calculator();
        int min = calculator.nonStaticMinNumberOf(30, 60);
        Application5 app5 = new Application5();
        // 같은 네임이라도 다른 클래스에서 사용되는 것을 불러와서 다시 사용할 수 있다.


        System.out.println("30과 60 중 더 작은 것은? : " + min);
        //위에 있는 import 구문 = 사전에 어떤 패키지의 클래스를 사용할 것인지 선언하는 효과
        //static 메서드의 경우
        int max = staticMaxNumberOf(100, 200);
        System.out.println("100과 200 중 더 큰 것은? : " + max);

        int max2 = staticMaxNumberOf(100, 200);
        System.out.println("100과 200 중 더 큰 것은? : " + max2);
    }
}
