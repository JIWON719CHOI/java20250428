package ch04.Exercise;

public class Exercise06 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) { // 별 개수
                System.out.print("🩷");
            }
            System.out.println(); // 줄 바꿈
        }

        System.out.println("----------------------------------------");

        for (int i = 1; i <= 5; i++)
            System.out.println("⭐".repeat(i)); // java11 부터 가능

        System.out.println("----------------------------------------");

        String s = "💗";
        for (int i = 0; i < 5; i++, s += "💗") {
            System.out.println(s);
        }
    }
}
