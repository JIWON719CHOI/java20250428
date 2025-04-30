package ch04.practice;

public class Exercise06 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) { // 별 개수
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }
    }
}
