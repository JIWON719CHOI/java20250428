package ch03.lecture;

public class C04Priority {
    public static void main(String[] args) {
        // 연산자는 연산 순서와 방향이 있다.
        // 순서와 방향을 외우지 말고
        // ()가 가장 우선 순위가 높으니 ()를 잘 활용하자!

        int a = 3 + 5 * 7;
        int b = 3 + (5 * 7);

        int c = (3 + 5) * 7;
    }
}
