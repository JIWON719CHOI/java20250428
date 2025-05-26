package ch18.lecture.p05filter;

import java.io.*;

public class App01 {
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

        Reader reader = new FileReader(fileName);

        BufferedReader br = new BufferedReader(reader);

        try (br; reader) {
            int r1 = br.read();
            System.out.println("(char) r1 = " + (char) r1);
        }
    }

}
