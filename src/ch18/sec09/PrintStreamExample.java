package ch18.sec09;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("C:/Temp/printstream.txt");

        PrintStream ps = new PrintStream(fos);

        ps.println("마치 ");
        ps.println("프린터가 출력하는 것 처럼 ");
        ps.println("데이터를 출력합니다. 🖨️");
        ps.printf("| %6d | %10s | %10s | \n", 1, "HONG", "THIEF");
        ps.printf("| %6d | %10s | %10s | \n", 2, "GAMJA", "STUDENT");

        ps.flush();
        ps.close();
    }
}
