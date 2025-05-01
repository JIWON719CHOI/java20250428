package ch04.lecture;

public class C18For {
    public static void main(String[] args) {

        // 중첩된 반복문 (for, while)

        for (int i = 0; i < 3; i++) {
            System.out.println("code");

            for (int j = 0; j < 4; j++) {
                System.out.println("inside code");
            }
        }

        System.out.println("------------------");

        for (int i = 0; i < 3; i++) {
            System.out.println("wow");
            for (int j = 0; j < 4; j++) {
                System.out.println(i + "," + j);
            }
        }

    }
}
