package com.ohgiraffers.section02.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Application4 {
    // FileWriter
    public static void main(String[] args) {

        /*
        * FileWriter
        * 프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림
        * character (1글자) 단위로 데이터를 처리한다.
        * */

        FileWriter fw = null;

        try {

            // 파일이 존재하지 않으면 생성을 해준다.
            // 두 번째 인자로 true를 전달하면 이어쓰기가 된다. (기본값은 false)
            fw = new FileWriter("src/main/java/com/ohgiraffers/section02/stream/testWriter.txt", true);

            fw.write(97); //a

            fw.write('a'); // a

            // 직접 char 자료형으로 내보내기도 가능

            char[] chrr = {10, 'a', 'p', 'p', 'l', 'e', 10};

            // 문자 배열로도 내보내기 가능
            fw.write(chrr);

            // 문자열로도 가능
            fw.write("동해물과 백두산이 마르고 닳도록");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 자원 반환
            if(fw != null) {
                try {
                    fw.close();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
