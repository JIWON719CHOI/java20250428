package ch18.lecture.p04reader;

import java.io.*;

public class App02 {
    public static void main(String[] args) throws IOException {

        String fileName = "C:/Temp/reader02.txt";
        // reader 연습용 파일
        try (Writer writer = new FileWriter(fileName)) {
            writer.write('a'); // 1
            writer.write('한'); // 1
            writer.write("🩷"); // 2
            writer.write("잉"); // 1
            writer.flush();
        }

        // reader 연습
        try (Reader reader = new FileReader(fileName)) {
            char[] data = new char[10];
            int length = reader.read(data);

            System.out.println("length = " + length); // 5

        }

    }
}
