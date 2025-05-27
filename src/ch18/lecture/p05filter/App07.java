package ch18.lecture.p05filter;

import java.io.*;

public class App07 {
    public static void main(String[] args) throws IOException {
        String file = "C:/Temp/filter07.txt";
        try (OutputStream os = new FileOutputStream(file)) {
            os.write('a');
            os.write('b');
        }

        // OutputStreamWriter : output stream 을 writer로 변환

        // PrintStream : output stream 을 사용해 출력하는 메소드
        OutputStream os = new FileOutputStream(file);
        PrintStream ps = new PrintStream(os);

        try (os; ps) {
            ps.println("AB");
            ps.println("🩷");
        }
    }
}
