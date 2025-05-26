package ch18.lecture.p02input;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class App02 {
    public static void main(String[] args) {
        String file = "C:/Temp/output1.data";
        try (InputStream is = new FileInputStream(file)) {

            int data = 0;
            while ((data = is.read()) != -1) {
                System.out.println("data = " + data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
