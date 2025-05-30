package ch16.sec01;

public class LambdaExample {
    public static void main(String[] args) {

        // 더하기
        action((x, y) -> {
            int result = x + y;
            System.out.println("result = " + result);
        });

        // 빼기
        action((x, y) -> {
            int result = x - y;
            System.out.println("result = " + result);
        });
    }

    public static void action(Calculable calculable) {
        int x = 10;
        int y = 4;
        calculable.calculate(x, y);
    }
}
