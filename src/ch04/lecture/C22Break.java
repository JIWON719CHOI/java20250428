package ch04.lecture;

public class C22Break {
    public static void main(String[] args) {
        while (true) {
            System.out.println(1);
            if (true) {
                break;
            }
            System.out.println(2);
        }
        System.out.println(3);
    }
}
