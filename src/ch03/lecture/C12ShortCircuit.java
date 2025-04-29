package ch03.lecture;

public class C12ShortCircuit {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        boolean r1 = ((a++) < 0) && ((b++) > 0);
        System.out.println(r1);
        System.out.println(a);
        System.out.println(b);

        a = 5;
        b = 3;
        boolean r2 = ((a++) < 0) & ((b++) > 0);
        System.out.println(r2);
        System.out.println(a);
        System.out.println(b);


    }
}
