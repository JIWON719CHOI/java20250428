package ch04.Exercise;

public class Exercise05 {
    public static void main(String[] args) {

        // 문제 :  4x + 5y = 60
        //         x, y는 10 이하의 자연수 (1~10)
        //         모든 해를 (x, y) 형태로 출력

        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                if (4 * x + 5 * y == 60) {
                    System.out.println("(" + x + ", " + y + ")");
                }
            }
        }
    }
}
