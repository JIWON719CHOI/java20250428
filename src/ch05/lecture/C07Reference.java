package ch05.lecture;

public class C07Reference {
    public static void main(String[] args) {
        int a;
        a = 3;

        int[] b;
        b = new int[]{4, 5, 6};

        int c;
        c = a;

        c = 5;

        int[] d;
        d = b;

        d[0] = 44;

        System.out.println("a = " + a);
        System.out.println("b[0] = " + b[0]);
        System.out.println("c = " + c);
        System.out.println("d[0] = " + d[0]);

    }
}