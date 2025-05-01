package ch05.lecture;

public class C01Array {
    public static void main(String[] args) {
        // 배열(array): 여러 값을 담을 수 있는 자료형 (data type)

        // 기본 타입
        int a;
        a = 3; // 하나의 값만 담을 수 있음

        // 배열
        int[] b;
        b = new int[5]; // 여러개의 값을 담을 수 있음

        // b는 5개의 int 값을 담을 수 있음
        b[0] = 9; // b의 0번 index
        b[1] = 8;
        b[2] = 7;
        b[3] = 6;
        b[4] = 5678;
//        b[5] = 1234; //존재하지 않는 index 사용 시 오류(Exception)


        // 연습
        // 3개의 int 값을 담을 수 있는 배열 c 를 만들어봐.
        int[] c;
        c = new int[3];

        // c의 각 index 에 값을 담아 보세요.
        c[0] = 789;
        c[1] = 123;
        c[2] = 456;

        // c의 각 index 의 값을 출력 해.
        System.out.println(c[0]);
        System.out.println(c[1]);
        System.out.println(c[2]);

        // double
        double[] d;
        d = new double[3];
        d[0] = 3.14;
        d[1] = 9.12;
        d[2] = 5.45;
        System.out.println(d[0]);
        System.out.println(d[1]);
        System.out.println(d[2]);

        // string
        String[] e;
        e = new String[2];
        e[0] = "hi";
        e[1] = "hello";
        System.out.println(e[0]);
        System.out.println(e[1]);
    }
}
