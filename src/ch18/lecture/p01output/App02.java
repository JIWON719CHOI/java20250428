package ch18.lecture.p01output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class App02 {
    public static void main(String[] args) throws IOException {
        // Output Stream: byte 단위 출력 스트림
        // write 메소드

        OutputStream os = new FileOutputStream("C:/Temp/output2.data");

        os.write(3000); // 1 byte
        os.write(new byte[]{7, 5, 4, 3, 2, 1});

        System.out.println("EXIT");
    }
}
