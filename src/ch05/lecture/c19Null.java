package ch05.lecture;

public class c19Null {
    public static void main(String[] args) {
        int[] a = {3, 5};

        // null : 가리키는 객체가 없다.
        int[] b = null; // b 라는 저장공간에 null..

//        System.out.println(b[0]); // NullPointerException

        int[][] c = {{8, 7}, {4, 3}};
        int[][] d = new int[2][];
        d[0] = new int[]{9, 1, 2};
        d[1] = new int[]{4, 10};

        System.out.println();
        int[][] e = {{3, 2}, {100, 200, 300}};
        int[][] f = new int[e.length][];

//        f[0] = new int[e[0].length];
//        f[0][0] = e[0][0];
//        f[0][1] = e[0][1];
//
//        f[1] = new int[e[1].length];
//        f[1][0] = e[1][0];
//        f[1][1] = e[1][1];
//        f[1][2] = e[1][2];

        for (int i = 0; i < e.length; i++) {
            f[i] = new int[e[i].length];
            for (int j = 0; j < e[i].length; j++) {
                f[i][j] = e[i][j];
            }
        }

        e[0][0] = 33;
        System.out.println(f[0][0]); // 3
    }
}
