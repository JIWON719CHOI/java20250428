package ch04.lecture;

public class C23Break {
    public static void main(String[] args) {
        // break : 가장 가까운 반복문 (for, while, switch) 종료

        // label 과 함께 사용하면 label 이 붙은 반복문(for, while) 종료

        loop1:
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                if (4 * x + 5 * y == 60) {
                    System.out.println("(" + x + ", " + y + ")");
                    break loop1;
                }
            }
        }
    }
}
