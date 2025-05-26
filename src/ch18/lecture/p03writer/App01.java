package ch18.lecture.p03writer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class App01 {
    public static void main(String[] args) throws IOException {
        try (OutputStream os = new FileOutputStream("C:/Temp/writer01.txt")) {

            // 아스키 코드 basic 라틴어
            os.write(97);
            os.write(100);
            os.write(103);
            os.write(33);

            os.write('t'); // t
            os.write('걸'); // x


            os.flush();
        }
    }
}
