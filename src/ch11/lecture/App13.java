package ch11.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App13 {
    public static void main(String[] args) {

    }

    public static void method1() throws FileNotFoundException {

//        FileNotFoundException(checked exception)
        // 1. try-catch 로 감싸거나
        // 2. method 에 명시하거나

        FileInputStream fio = new FileInputStream("");
    }
}
