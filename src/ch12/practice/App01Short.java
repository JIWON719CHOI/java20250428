package ch12.practice;

import java.util.*;

public class App01Short {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] hands = {"✌️", "✊", "✋"};
        int cnt = 0;

        while (cnt < 5) {
            System.out.print("0:✌️ 1:✊ 2:✋ > ");
            try {
                int u = Integer.parseInt(sc.nextLine()), c = new Random().nextInt(3);
                if (u < 0 || u > 2) {
                    System.out.println("0~2만.");
                    continue;
                }

                System.out.printf("🧑=%s 🖥️=%s\n", hands[u], hands[c]);
                int r = (3 + u - c) % 3;
                System.out.println(r == 0 ? "비김\n" : (r == 1 ? "이김\n" : "짐\n"));
                cnt++;
            } catch (Exception e) {
                System.out.println("숫자만.");
            }
        }
    }
}
