package ch08.lecture.p04api;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class App02 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        // Object
        Object i = s;
        // Closeable
        Closeable j = s;
        // AutoCloseable
        AutoCloseable k = s;
        // Iterator
        Iterator l = s;

        // instanceof
        System.out.println(s instanceof Object);
        System.out.println(s instanceof Closeable);
        System.out.println(s instanceof AutoCloseable);
        System.out.println(s instanceof Iterator);

        j.close();
        // c.nextLine();
        Scanner c1 = (Scanner) j;
        c1.nextLine();
    }
}
