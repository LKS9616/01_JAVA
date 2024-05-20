package com.ogiraffers.section02.variable;

public class Application1 {
    public static void main(String[ ] args) {

        /*
        * 변수의 사용목적
        * 1. 값에 의미를 부여하기 위한 목적(의미 전달이 쉬워야 코드를 읽기 쉬워지고, 협업 및 유지보수에 유리하기 때문이다)
        * 2. 한 번 저장해둔 값을 재사용하기 위한 목적(변수를 이용하여 코드를 작성하면, 값을 변경할 때도 보다 간편하게 변경할 수 있다.
        * 3. 시간에 따라 변하는 값을 저장하고 사용할 수 있다. (변수는 변하는 값을 저장하기 위한 공간이다.)
        */

        System.out.println("========== 값에 의미 부여 테스트==========");
        System.out.println("보너스를 포함한 급여 : " + (3000000 + 200000) + "원");

        int salary = 3000000;
        int bonus = 200000;
        System.out.println("보너스를 포함한 급여 : " + (salary + bonus) + "원");

        System.out.println("========== 변수에 저장한 값 재사용 테스트==========");
        // 10명의 고객에게 100포인트를 지급해주는 내용을 출력해봅시다
        System.out.println("1번 고객에게 200포인트를 지급하였습니다.");
        System.out.println("2번 고객에게 200포인트를 지급하였습니다.");
        System.out.println("3번 고객에게 200포인트를 지급하였습니다.");
        System.out.println("4번 고객에게 200포인트를 지급하였습니다.");
        System.out.println("5번 고객에게 200포인트를 지급하였습니다.");
        System.out.println("6번 고객에게 200포인트를 지급하였습니다.");
        System.out.println("7번 고객에게 200포인트를 지급하였습니다.");
        System.out.println("8번 고객에게 200포인트를 지급하였습니다.");
        System.out.println("9번 고객에게 200포인트를 지급하였습니다.");
        System.out.println("10번 고객에게 200포인트를 지급하였습니다.");
        // 200포인트로 바뀌었을 경우 10번 변경해야 함

        int point = 200;
        System.out.println("1번 고객에게 " + point + "포인트를 지급하였습니다.");
        System.out.println("2번 고객에게 " + point + "포인트를 지급하였습니다.");
        System.out.println("3번 고객에게 " + point + "포인트를 지급하였습니다.");
        System.out.println("4번 고객에게 " + point + "포인트를 지급하였습니다.");
        System.out.println("5번 고객에게 " + point + "포인트를 지급하였습니다.");
        System.out.println("6번 고객에게 " + point + "포인트를 지급하였습니다.");
        System.out.println("7번 고객에게 " + point + "포인트를 지급하였습니다.");
        System.out.println("8번 고객에게 " + point + "포인트를 지급하였습니다.");
        System.out.println("9번 고객에게 " + point + "포인트를 지급하였습니다.");
        System.out.println("10번 고객에게 " + point + "포인트를 지급하였습니다.");

        System.out.println();

        System.out.println("========== 변수에 저장된 값 저장 변경 테스트]==========");
        // 변수는 하나의 값을 저장하고 사용하기 위한 공간이기보다, 변하는 값을 저장하기 위한 공간이다.
        int sum = 0;
        // Taegeun bear = ?? 헷갈릴 수 있어서 절대적인 공간이 있음
        // 변수가 나오면 int sum \= 0 사이에 이런 선을 그어서 왼쪽은 공간이고 오른쪽은 값이라 생각할 것
        // int sum = 0 / sum = sum + 10;의 경우 왼쪽 sum은 10 오른쪽은 0

        sum = sum + 10;
        System.out.println("sum에 10을 더하면 현재 sum의 값은 ? " + sum); // 10

        sum = sum + 10;
        System.out.println("sum에 10을 더하면 현재 sum의 값은 ? " + sum); // 20

        // 자료형 변수명 = 값;
        // 기본 자료형은 8개, 기본 자료형은 String, 정수형은 4가지 종류,
        // 빨간줄 나오는 에러: 컴파일에러(컴퓨터가 알아볼 수 있게 컴파일 과정에서 나는 에러-미리 알려줌)
        // 컴파일할때 미리 정해진 약속에 맞지 않을 시 컴파일에서
        // 어느 형태에 어떤 논리가 들어가는지는 필수적으로 외워야 함(용량까지 나중에 외워야 하지만 지금은 표현식부터)
        // int, double이라는 두 표현식만 색이 다른 이유는 (나중에 영상확인할것!!)
        // char에는 음수 x, int는 -21억부터 21억까지. 기본형 외워둘것, 정수형은 long 빼면 기본값은 0
        // 0L을 0l이라고 써도 상관없지만 가독성상, float은 0.0f double은 d안 붙여도 상관X







    }
}
