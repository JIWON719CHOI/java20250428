package ch12.lecture.p03math;

public class App01 {
    public static void main(String[] args) {
        // Math: 수학 연산관련 메소드들이 있는 클래스

        // 반올림
        long round = Math.round(3.14);
        System.out.println("round = " + round);
        long round1 = Math.round(3.7);
        System.out.println("round1 = " + round1);

        // 올림
        double ceil = Math.ceil(3.14);
        System.out.println("ceil = " + ceil);

        // 내림(버림)
        double floor = Math.floor(3.14);
        System.out.println("floor = " + floor);

        // square root
        double sqrt = Math.sqrt(4);
        System.out.println("sqrt = " + sqrt);
        double sqrt1 = Math.sqrt(121);
        System.out.println("sqrt1 = " + sqrt1);

        // 절대값
        int abs = Math.abs(10);
        System.out.println("abs = " + abs);
        int abs1 = Math.abs(-7);
        System.out.println("abs1 = " + abs1);

        // 큰값
        double max = Math.max(3.14, 9.7);
        System.out.println("max = " + max);
        double max1 = Math.max(8.12, 4.3);
        System.out.println("max1 = " + max1);

        // 작은값
        int min = Math.min(5, 1);
        System.out.println("min = " + min);
        int min1 = Math.min(-4, 10);
        System.out.println("min1 = " + min1);

        // PI
        double a = 3 * 3 * Math.PI;
        System.out.println("a = " + a);
    }
}