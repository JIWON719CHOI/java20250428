package ch04.Exercise;

public class Exercise05Break {
    public static void main(String[] args) {
        // 문제 :  4x + 5y = 60
        //         x, y는 10 이하의 자연수 (1~10)
        //         모든 해를 (x, y) 형태로 출력
        // 1번만 찾고 break 해라.
        boolean gotcha = false;
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                if (4 * x + 5 * y == 60) {
                    System.out.println("(" + x + ", " + y + ")");
                    gotcha = true;
                }
            }
            if (gotcha) {
                break; // 가장 가까운 반복문 종료
            }
        }
    }
}
