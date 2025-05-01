package ch04.Exercise;

public class Exercise03 {
    public static void main(String[] args) {
        int i = 3;
        int x = 0;

        while (i <= 100) {
            x += i;
            i += 3;
        }
        System.out.println(x);

        int sum2 = 0;
        int j = 0;
        while (j <= 100) {
            j += 3;
        }
    }
}
