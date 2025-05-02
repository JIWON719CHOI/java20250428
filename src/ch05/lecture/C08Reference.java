package ch05.lecture;

public class C08Reference {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;

        System.out.println(a);
        System.out.println(b);

        int[] c = {5, 6};
        int[] d = {5, 6};

        System.out.println(c[0]);
        System.out.println(d[0]);

        a = 33;
        System.out.println(a);
        System.out.println(b);

        c[0] = 55;
        System.out.println(c[0]);
        System.out.println(d[0]);

        System.out.println("========================================");

        int e = 7;
        int f = e;

        int[] g = {9, 1};
        int[] h = g;

        System.out.println(g[0]);
        System.out.println(h[0]);

        e = 77;
        System.out.println("f = " + f);

        g[0] = 99;
        System.out.println(h[0]);

    }
}
