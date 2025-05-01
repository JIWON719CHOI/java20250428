package ch05.lecture;

public class C03Array {
    public static void main(String[] args) {
        int[] a = new int[3];
//        a[0] = 9;
//        a[1] = 8;
//        a[2] = 2;

        // 배열에 값을 넣지 않으면 0
        for (int i = 0; i < 3; i++) {
            System.out.println(a[i]);
        }

        double[] b = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println(b[i]);
        }

        boolean[] c = new boolean[3];
        for (int i = 0; i < 3; i++) {
            System.out.println(c[i]);
        }

        // String 배열의 각 index 기본값 null(?)
        String[] d = new String[3];
//        d[0] = "hi";
//        d[1] = "hello";
//        d[2] = "안녕";
        for (int i = 0; i < 3; i++) {
            System.out.println(d[i]);
        }

    }
}