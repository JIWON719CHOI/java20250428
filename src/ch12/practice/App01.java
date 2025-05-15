package ch12.practice;

import java.util.Random;
import java.util.Scanner;

public class App01 {
    public static void main(String[] args) {
        // 컴퓨터와 가위바위보 게임하기
        // 1. 사용자에게 가위, 바위, 보 중에 키보드로 입력 받기
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int cnt = 0;

        do {
            System.out.println("----------------------");
            System.out.println("0. ✌️ 1. ✊ 2. ✋");
            System.out.println("번호: ");
            int num;
            try {
                num = Integer.parseInt(scanner.nextLine());
                if (num < 0 || num > 2) {
                    System.out.println("0~2 숫자만 써.");
                    System.out.println("현재 라운드: " + cnt + "/5\n");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("0~2 숫자만 입력하라고.");
                continue;
            }
            // 2. 컴퓨터는 랜덤하게 가위, 바위, 보 중에 고르기
            int com = random.nextInt(3);

            System.out.print("🧑 = ");
            if (num == 0) System.out.println("✌️");
            else if (num == 1) System.out.println("✊");
            else System.out.println("✋");

            System.out.print("🖥️ = ");
            if (com == 0) System.out.println("✌️");
            else if (com == 1) System.out.println("✊");
            else System.out.println("✋");

            // 3. 사용자와 컴퓨터 간의 결과 (이김, 비김, 짐) 출력하기
            if (num == com) {
                System.out.println("비겼어. 다시!");
            } else if ((num == 0 && com == 2) || (num == 1 && com == 0) || (num == 2 && com == 1)) {
                System.out.println("너가 이김.");
                cnt++;
            } else {
                System.out.println("너가 짐.");
                cnt++;
            }
            System.out.println("현재 라운드: " + cnt + "/5\n");
        } while (cnt < 5);
    }
}
