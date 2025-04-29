package ch02.lecture;

public class C18Operator {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        int c = a + b; // int
        System.out.println("c = " + c);

        // 다른 타입끼리 산술 연산
        // 상대적으로 더 큰 타입이 연산 결과로 이뤄져야 함.
        int d = 10;
        long e = 20L;
//        int f = d + e; // 않되~~
        long g = d + e;

        int h = 3;
        double i = 3.14;
        double j = h + i; // 더블이 더 크잖아...

        // byte, short, int 끼리의 연산 결과는 무조건 int!!!!!
        byte k = 5;
        int l = 7;
        int m = k + l;

        byte n = 7;
        byte o = 9;
        int p = n + o; // 바이트 끼리 해도 int 로 해야 해!!!!!!!!

        int r = 5;
        int s = 3;
        int t = r / s;
        System.out.println("t = " + t); // 오.. 나누기도 소수점 생략해서 int로..

        double u = r / s;
        System.out.println("u = " + u); // 아무리 더블에 담아도 이미 연산결과는 1로 나온다.

        double v = r / (double) s;
        double w = (double) r / s;
        System.out.println("v = " + v);
        System.out.println("w = " + w); // 소수점 얻고 싶으면 형변환 해야해.

    }
}
