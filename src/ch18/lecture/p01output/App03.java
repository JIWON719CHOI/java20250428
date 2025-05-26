package ch18.lecture.p01output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class App03 {
    public static void main(String[] args) throws IOException {

        OutputStream os = new FileOutputStream("C:/Temp/output3.data");

        os.write(300); // 1byte
        os.write(new byte[]{1, 2, 3, 4, 5}); // 5byte
        os.write(new byte[]{2, 3, 4, 5, 6, 7}, 2, 3); // 2번 index 부터 3개

        System.out.println("EXIT");
    }
}
