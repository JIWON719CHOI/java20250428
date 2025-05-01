package ch04.Exercise;

public class Exercise04 {
    public static void main(String[] args) {

        System.out.println("---------지원-------------");
        int i = 0;

        while (i != 5) {
            int random1 = ((int) (Math.random() * 6)) + 1;
            int random2 = ((int) (Math.random() * 6)) + 1;
            i = random2 + random1;
            System.out.println("🎲 = " + i + " 아직이야!!!");
            if (i == 5) {
                System.out.println("🎲 = " + i + " 나왔다!!!");
                break;
            }
        }
        System.out.println("----------GPT------------");
        while (true) {
            int sum = (int) (Math.random() * 6) + 1 + (int) (Math.random() * 6) + 1;
            System.out.println("🎲🎲 = " + sum + (sum == 5 ? " 나왔다!!!" : " 아직이야!!!"));
            if (sum == 5) break;
        }
        System.out.println("----------민우------------");
        while (true) {
            int sum1 = (int) (Math.random() * 6) + 1 + (int) (Math.random() * 6) + 1;
            if (sum1 == 5) {
                System.out.println("🎲🎲🎲 = " + sum1 + " 나왔다!!!");
                break;
            } else System.out.println("🎲🎲🎲 = " + sum1 + " 아직이야!!!");
        }
        System.out.println("----------지원------------");
        int sum3;
        do {
            sum3 = (int) (Math.random() * 6) + 1 + (int) (Math.random() * 6) + 1;
            System.out.println("🎲🎲🎲🎲 = " + sum3 + (sum3 == 5 ? " 나왔다!!!" : " 아직이야!!!"));
        } while (sum3 != 5);
    }
}

