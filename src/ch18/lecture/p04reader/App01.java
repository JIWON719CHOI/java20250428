package ch18.lecture.p04reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class App01 {
    public static void main(String[] args) throws IOException {
        // reader : 문자 단위 입력 스트림
        String fileName = "C:/Temp/writer03.txt";
        try (Reader reader = new FileReader(fileName)) {
            int r1 = reader.read();
            int r2 = reader.read();
            int r3 = reader.read();
            int r4 = reader.read();
            int r5 = reader.read();
            int r6 = reader.read(); // 더 이상 읽은 문자가 없을 때 -1

            System.out.println("r1 = " + (char) r1);
            System.out.println("r2 = " + (char) r2);
            System.out.println("r3 = " + (char) r3);
            System.out.println("r4 = " + (char) r4);
            System.out.println("r5 = " + (char) r5);
            System.out.println("r6 = " + r6);
        }
    }
}
