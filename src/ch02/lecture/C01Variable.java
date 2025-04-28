package ch02.lecture;

public class C01Variable {
    public static void main(String[] args) {
        // 변수 : 값을 담는 이름있는 공간

        // 변수 선언
        // 타입 변수명;
        int a;
        double b;
        String c;

        // 변수에 값 할당(대입, assign, assignment)
        // 변수 = 값;
        a = 9;
        b = 3.14;
        c = "hello";

        // 변수 선언과 값 할당을 한 명령문에
        // 타입 변수명 = 값
        int d = 7;
        double e = 9.12;
        String f = "Java";

        // 여러 변수를 한 명령문에서 선언
        int g, h;
        double i, j, k;
        String l, m, n;

        g = 2;
        h = 5;
        i = 1.23;
        n = "hi";

        // 여러 변수선언과 값 할당을 한 명령문에서 작성
        int p = 3, q = 3;
        double r = 3.14, s = 9.12;

        // 변수에 값을 넣지 않고 사용할 수 없음
        int t = 3; // 값 있음
        int u; // 값 없음
        int v; // 값 없음
        u = 4;

        System.out.println(t);
        System.out.println(u);
//        System.out.println(v); //안됨

    }
}
