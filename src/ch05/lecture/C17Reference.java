package ch05.lecture;

import java.util.Arrays;

public class C17Reference {
    public static void main(String[] args) {
        int[] a = {9, 3};
        int[] b = new int[a.length];
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        a[0] = 99;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b)); // 9, 3

        System.out.println("======================================");

        int[][] c = {{9, 2}, {5, 6}};
        int[][] d = new int[c.length][];
        System.out.println(Arrays.toString(c[0])); // 9, 2
        System.out.println(Arrays.toString(d[0])); // null

        for (int i = 0; i < c.length; i++) {
            d[i] = c[i];
        }
        System.out.println(Arrays.toString(c[0]));
        System.out.println(Arrays.toString(d[0]));
        c[0][0] = 99;
        System.out.println(Arrays.toString(c[0])); // 99, 2
        System.out.println(Arrays.toString(d[0])); // 99, 2 참조값이 복사 되었기 때문
    }
}
