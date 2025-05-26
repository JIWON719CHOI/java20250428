package ch18.lecture.p02input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class App01 {
    public static void main(String[] args) {
        // input stream (입력 스트림) : 프로그램으로 바이트 단위로 데이터를 읽는 스트림

        String filename = "C:/Temp/output1.data";
        try (InputStream is = new FileInputStream(filename)) {
            // read: 1 byte를 읽어서 리턴
            int r1 = is.read();
            int r2 = is.read();
            int r3 = is.read();
            int r4 = is.read(); // 더이상 읽을 것이 없으면 -1 을 리턴함.

            System.out.println("r1 = " + r1);
            System.out.println("r2 = " + r2);
            System.out.println("r3 = " + r3);
            System.out.println("r4 = " + r4);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
