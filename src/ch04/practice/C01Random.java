package ch04.practice;

public class C01Random {
    public static void main(String[] args) {
        // 두 개의 주사위를 돌려서
        // 같은 값이 나오면 "당첨"
        // 아니면 "다시 돌려보세요"

        int random1 = ((int) (Math.random() * 6)) + 1;
        int random2 = ((int) (Math.random() * 6)) + 1;
        System.out.println("🎲 주사위 결과: " + random1 + ", " + random2);

        if (random1 == random2) {
            System.out.println("🎉당첨!!");
        } else {
            System.out.println("🔙다시!!");
        }
    }
}
