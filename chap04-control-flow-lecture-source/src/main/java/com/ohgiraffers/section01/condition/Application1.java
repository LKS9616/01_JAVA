package com.ohgiraffers.section01.condition;

public class Application1 {
    // 실행용 클래스
    public static void main (String[] args) {

        A_If aIf = new A_If();
        // aIf.testSimpleIfStatement(); // 단일 if문
        // aIf.testNestedIfStatement();

        B_IfElse bIfElse = new B_IfElse();
        // bIfElse.testSimpleIfElseStatement();
        // bIfElse.testNestedIfElseStatement();

        C_IfElseIf cIfElseIf = new C_IfElseIf();
        // cIfElseIf.testSimpleIfElseIfStatement();
        // cIfElseIf.testTest();

        D_Switch dSwitch = new D_Switch();
        // dSwitch.testSimpleSwitchStatement();
        //dSwitch.testSwitchVendingMachine();

        E_SwitchIfElseIf es = new E_SwitchIfElseIf();
        es.tester();



    }
}
