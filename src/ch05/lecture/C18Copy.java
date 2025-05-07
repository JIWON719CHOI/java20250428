package ch05.lecture;

import java.util.Arrays;

public class C18Copy {
    public static void main(String[] args) {
        int[][] a = {{9, 3}, {5, 7, 10}};
        int[][] b = a; // 참조값 복사
        int[][] c = {a[0], a[1]}; // 원소(item)의 참조값 복사
        int[][] d = {{a[0][0], a[0][1]}, {a[1][1], a[1][2]}};

        a[0][0] = 99;
        System.out.println(Arrays.toString(a[0])); // 99, 3
        System.out.println(Arrays.toString(b[0])); // 99, 3
        System.out.println(Arrays.toString(c[0])); // 99, 3
        System.out.println(Arrays.toString(d[0])); // 9, 3

        // for 문 사용해서 2차원 배열 복사
        int[][] e = new int[a.length][];
        for (int i = 0; i < a.length; i++) {
            e[i] = new int[a[i].length]; // ?
            for (int j = 0; j < a[i].length; j++) {
                e[i][j] = a[i][j];
            }
        }

        System.out.println("e[0] = " + Arrays.toString(e[0])); //99, 3
        System.out.println("e[1] = " + Arrays.toString(e[1])); // 5, 7 ,10
        a[0][0] = 999;
        System.out.println("e[0] = " + Arrays.toString(e[0])); // 99, 3
        System.out.println("e[1] = " + Arrays.toString(e[1])); // 5, 7, 10

    }
}
