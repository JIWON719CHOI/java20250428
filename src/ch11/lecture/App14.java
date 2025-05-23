package ch11.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App14 {
    public static void main(String[] args) throws FileNotFoundException {
        method4();

        System.out.println("프로그램 실행");
    }

    public static void method4() throws FileNotFoundException {
        method3();
    }

    public static void method3() throws FileNotFoundException {
        method2();
    }

    public static void method2() throws FileNotFoundException {
        method1();
    }

    public static void method1() throws FileNotFoundException {
        FileInputStream fio = new FileInputStream("");
    }
}