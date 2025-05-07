package ch05.lecture;

import java.util.Arrays;

public class C16Reference {
    public static void main(String[] args) {
        /// 1차원 배열
        // 참조값 복사
        int[] a = {7, 5};
        int[] b = a;

        a[0] = 77;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println("-------------------------------------------");

        // 배열 복사
        int[] c = {9, 2}; // 얘는 기본타입 값..
        int[] d = {c[0], c[1]}; // 얘는 참조값 가져간거.
        c[0] = 99;
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));

        System.out.println("===========================================");

        /// 2차원 배열
        // 참조값 복사
        int[][] e = {{8, 5}, {10, 20}};
        int[][] f = e;

        e[0][0] = 88;
        System.out.println(Arrays.toString(e[0]));
        System.out.println(Arrays.toString(f[0]));

        System.out.println("-------------------------------------------");

        // 배열 복사
        int[][] g = {{5, 1}, {6, 8}};
        int[][] h = {g[0], g[1]};

        g[0][0] = 55;
        System.out.println(Arrays.toString(g[0])); // 55, 1
        System.out.println(Arrays.toString(h[0])); // 55, 1

    }

}
