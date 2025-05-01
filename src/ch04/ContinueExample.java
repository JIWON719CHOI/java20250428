package ch04;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) { // 2로 나눈 나머지가 0이 아닌 홀수!
                continue;
            }
            System.out.println(i + " "); // 홀수는 실행 안됨.
        }
    }
}
