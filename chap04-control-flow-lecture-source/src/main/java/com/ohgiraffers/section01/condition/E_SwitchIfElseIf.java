package com.ohgiraffers.section01.condition;

import java.util.Scanner;

public class E_SwitchIfElseIf {

    public void tester() {
        System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨리고 말았다.");
        System.out.println("연못에서 산신령이 나타나 금도끼, 은토끼, 쇠도끼를 들고 나타났다.");
        System.out.println("나무꾼에게 셋 중 어떤 도끼가 나무꾼의 도끼인지 물어보았다.");

        System.out.println("어느 도끼가 너의 도끼이냐? (1. 금도끼. 2. 은도끼. 3. 쇠도끼");

        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine(); //1, 2, 3 중에 받아준다.
        switch (answer) {
            case "금도끼":
                System.out.println("이런 거짓말쟁이!! 너에게는 아무런 도끼도 줄 수 없구나, 이 욕심쟁이야!!");
                break;
            case "은도끼":
                System.out.println("욕심이 과하지는 않지만, 넌 거짓말을 하고 있구나!! 어서 썩 사라지더라");
                break;
            case "쇠도끼":
                System.out.println("오호 ~ 정직하구나 금도끼, 은도끼, 쇠도끼 다 가져가거라..");
                break;
            default:
                System.out.println("잘못 입력했구나.. 돌아가거라.");
        }

        System.out.println("그렇게.. 산신령은.. 다시 연못으로.. 사라지고 말았다..");






    }
}
