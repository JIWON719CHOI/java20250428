package ch18.lecture.p05filter;

import java.io.*;

public class App06 {
    public static void main(String[] args) throws IOException {
        String file = "C:/Temp/filter05.txt";
        InputStream is = getInputStream(file);
        // InputStreamReader
        // InputStream을 Reader 로 바꿔 주는 filter Stream

        Reader isr = new InputStreamReader(is);
        try (is; isr) {
            int r1 = isr.read();
            int r2 = isr.read();
            int r3 = isr.read();
            int r4 = isr.read();
            int r5 = isr.read();
            System.out.println("r1 = " + (char) r1);
            System.out.println("r2 = " + (char) r2);
            System.out.println("r3 = " + (char) r3);
            System.out.println("r4 = " + (char) r4);
            System.out.println("r5 = " + (char) r5);
        }
    }

    private static InputStream getInputStream(String file) throws IOException {
        return new FileInputStream(file);
    }
}