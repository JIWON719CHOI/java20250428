package ch04.lecture;

public class C21For {
    public static void main(String[] args) {

        System.out.println("코드");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}