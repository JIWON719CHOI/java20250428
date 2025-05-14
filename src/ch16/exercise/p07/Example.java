package ch16.exercise.p07;

public class Example {
    private static final int[] scores = {10, 50, 3};

    public static int maxOrMin(Operator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.apply(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        // max
        int max = maxOrMin(Math::max);
        System.out.println("MAX: " + max);

        // min
        int min = maxOrMin(Math::min);
        System.out.println("MIN: " + min);
    }
}
