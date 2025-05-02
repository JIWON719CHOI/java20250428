package ch05.lecture;

import java.util.Arrays;

public class C11Null {
    public static void main(String[] args) {
        // null : 참조하는 객체(instance)가 없다.

        int[] a = {3, 4, 5};
        int[] b = a;

        b[0] = 33;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        b = null; // 참조하는 객체가 없다.
        System.out.println(b.length); // NullPointerException 오류

        int[] c = new int[3];
        System.out.println(Arrays.toString(c));

        String[] d = new String[3];
        System.out.println(Arrays.toString(d));
        d[0] = "java";
        d[2] = "react";
        System.out.println(Arrays.toString(d));
    }
}
