package ch18.lecture.p05filter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class App08 {
    public static void main(String[] args) throws IOException {
        String file = "C:/Temp/filter08.txt";
        try (Writer writer = new FileWriter(file)) {
            writer.write('a');
            writer.write("🩷"); // 원래는 이모지 안되는데 자바 11버전 이상 부터는 가능.
            writer.write('한');
        }


        // PrintWriter : Writer를 감싸는 filter stream
        // print 출력하듯 기능하는 print... 메소드들이 있음
        Writer writer = new FileWriter(file);
        PrintWriter pw = new PrintWriter(writer);

        try (pw; writer) {
            pw.println("abxy");
            pw.println("한글가능");
            pw.println("🩷🩷🩷🩷");
            pw.flush();
        }
    }
}
