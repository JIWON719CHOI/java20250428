package ch18.lecture.p01output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class App05 {
    public static void main(String[] args) throws IOException {

        String file = "C:/Temp/output5.data";

        // 예전 방식...
        OutputStream os = null;
        try {
            os = new FileOutputStream(file);
            os.write(1);
        } finally {
            os.close(); // 꼭 해야 함! ⭐⭐⭐
        }

        //try-with-resources 사용
        // try 의 () 내에 닫을 stream 을 선언하면, java가 자동으로 닫아줌
        try (OutputStream os2 = new FileOutputStream(file);) {
            os2.write(2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 이런 방법도 있음 책 11장에 있음.
        try {
            OutputStream os3 = new FileOutputStream(file);
            try (os3) {
                os3.write(3);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
