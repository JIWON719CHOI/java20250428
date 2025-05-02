package ch05.lecture;

public class C12EnhancedFor {
    public static void main(String[] args) {

        int[] a = {88, 55, 22, 0, 1, 2, 3};

        // for
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        // enhanced for
        System.out.println("--------향상된 for문-------------");
        for (int item : a) {
            System.out.println(item);
        }

        String[] b = {"java", "react", "spring", "html", "css"};
        for (String s : b) {
            System.out.println(s);
        }
        double[] c = {3.14, 2.34, 5.89};
        for (double d : c) {
            System.out.println(d);
        }
    }
}
