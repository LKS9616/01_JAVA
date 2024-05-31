package com.ohgiraffers.section02.set.run;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application2 {
    public static void main(String[] args) {
        // LinkedHashSet
        
        /*
        * LinkedHashSet 클래스
        * HashSet이 가지는 기능을 모두 가지고 있고
        * 추가적으로 저장 순서를 유지하는 특징을 가지고 있다.
        * */

        LinkedHashSet<String> lHset = new LinkedHashSet<String>();
        
        lHset.add("java");
        lHset.add("oracle");
        lHset.add("jdbc");
        lHset.add("html");
        lHset.add("css");

        System.out.println("lHset = " + lHset);

        // 오름차순
        /*
        * TreeSet으로 객체를 생성하면 같은 타입의 객체를 자동으로 비교하여 오름차순으로 정렬한다.
        * */
        TreeSet<String> tSet = new TreeSet<String>();

        tSet.add("java");
        tSet.add("oracle");
        tSet.add("jdbc");
        tSet.add("html");
        tSet.add("css");

        System.out.println("tSet = " + tSet);
    }
}
