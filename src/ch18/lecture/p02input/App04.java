package ch18.lecture.p02input;

import java.io.*;
import java.util.Arrays;

public class App04 {
    public static void main(String[] args) throws IOException {
        // input-stream 에서 사용할 파일을 먼저 만들기
        String fileName = "C:/Temp/input03.data";
        try (OutputStream os = new FileOutputStream(fileName)) {
            for (int i = 0; i < 35; i++) {
                os.write(i);
            }
        }
        System.out.println("EXIT");

        byte[] data = new byte[10];

        try (InputStream is = new FileInputStream(fileName)) {
            int length = 0;
            while ((length = is.read(data)) != -1) {
                byte[] copy = Arrays.copyOf(data, length);
                System.out.println("data = " + Arrays.toString(copy));
            }
        }
    }
}
