package ch05.lecture;

public class C13MultiDimension {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;

        // 2차원 배열 (배열이 원소인 배열)
        int[][] a = new int[3][];

        System.out.println(a.length);
        a[0] = new int[4];
        a[1] = new int[4];
        a[2] = new int[4];

        a[0][0] = 99;
        a[0][1] = 88;
        a[0][2] = 77;
        a[0][3] = 66;

        a[1][0] = 111;
        a[1][1] = 222;
        a[1][2] = 333;
        a[1][3] = 444;

        a[2][0] = 101;
        
        a[2][1] = 202;
        a[2][2] = 303;
        a[2][3] = 404;

        // 2차원 배열(행렬, matrix) 전체 탐색
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("a[" + i + "]" + "[" + j + "]=" + a[i][j]);
            }
        }


    }
}
