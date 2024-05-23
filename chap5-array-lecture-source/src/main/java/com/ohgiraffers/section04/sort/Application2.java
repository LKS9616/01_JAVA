package com.ohgiraffers.section04.sort;

public class Application2 {
    public static void main(String [] args) {
        //순차정렬
        // 배열의 처음과 끝을 탐색하면서 차순대로 정렬하는 가장 기초적인 알고리즘

        // 정렬할 배열
        int[] iarr = {2, 5, 4, 6, 1, 3};

        for (int i = 1; i < iarr.length; i++) {

            for (int j = 0; j < i; j++) {

                //if 문의 부등호 방향을 바꿔서
                // 내림차순 -> 오름차순 방향으로 바꿀 수 있다.

                if (iarr[i] < iarr[j]) {
                    int temp;
                    temp = iarr[i];
                    iarr[i] = iarr[j];
                    iarr[j] = temp;
                }
            }
        }

        // {2, 5, 4, 6, 1, 3}으로 시작
        // 1회차: i가 1부터 시작, iarr[1] <iarr[0]으로 비교, iarr[1]:5 < iarr[0] : 2로 성립하지 않음 false
        // 2회차: (i = 2), iarr[2] : 4 < iarr[0]: 2
        // iarr[2] : 4 < iarr[1]: 5 -> true 값바꿔줌. / temp2 = iarr[2]: 4 / iarr[2] = iarr[1] : 5 / iarr[1] = temp: 4
        // { 2, 4, 5, 6, 1, 3 }
        // j가 2이 되었으니 for문 탈출
        // 3회차 i = 3 / iarr[3] : 6 < iarr[0] : 2 / iarr[3]: 6 < iarr[1] : 4 < iarr[3] : 6 < iarr[2] : 5
        // 4회차 i = 4 / iarr[4] : 1 < iarr[0] : 2 / temp = iarr[4] : 1 / iarr[4] = iarr[0] : 2 / iarr[0] = temp1 : 1
        // 4회차 결과 { 1, 2, 4, 5, 6, 3}
        // 5회차 결과 { 1, 2, 3, 5, 6. 4}

        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");


        }
    }
}


