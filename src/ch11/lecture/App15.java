package ch11.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App15 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // throws로 여러 exception 발생한다고 명시할 수 있음
    public static void method1() throws FileNotFoundException, ClassNotFoundException {

        // FileNotFoundException
        FileInputStream fio = new FileInputStream("");

        // ClassNotFoundException
        Class.forName("");

    }
}