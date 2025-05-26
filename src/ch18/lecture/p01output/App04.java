package ch18.lecture.p01output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class App04 {
    public static void main(String[] args) throws IOException, InterruptedException {
        String fileName = "C:/Temp/output4.data";

        OutputStream os = new FileOutputStream(fileName);

        for (int i = 0; i < 10; i++) {
            System.out.println(i + "번째 쓰는 중....");
            os.write(1);
            Thread.sleep(2000);
        }
        System.out.println("EXIT");

        // 사용한 stream(자원, resource)를 닫음
        // open 한 곳에서 close 를 해야 함.
        os.close();
    }
}
