package ch18.lecture.p06file;

import java.io.File;

public class App01 {
    public static void main(String[] args) {
        // File : file 정보를 담고 있는 객체
        File f1 = new File("C:/Temp/nothing.txt");
        File f2 = new File("C:/Temp/bear.jpg");

        // exists
        boolean r1 = f1.exists();
        System.out.println("r1 = " + r1);
        boolean r2 = f2.exists();
        System.out.println("r2 = " + r2);

        // getName
        String n1 = f2.getName();
        System.out.println("n1 = " + n1);

        // getPath
        String p1 = f2.getPath();
        System.out.println("p1 = " + p1);

        // length
        long l2 = f2.length();
        System.out.println("l2 = " + l2);

        // isDirectory
        boolean d2 = f2.isDirectory();
        System.out.println("d2 = " + d2);

        // isFile
        boolean i2 = f2.isFile();
        System.out.println("i2 = " + i2);

    }
}