package ch12.lecture.p03math;

import java.util.Random;
import java.util.Scanner;

public class App04 {
    public static void main(String[] args) {
        System.out.println("** 가위바위보 게임 시작 **");
        Scanner scanner = new Scanner(System.in);
        // 컴퓨터와 가위바위보 게임
        while (true) {// 1.사용자에게 가위,바위,보 중에 키보드로 입력받기
            System.out.println();
            System.out.println("가위 바위 보 중에 선택해 주세요.");
            System.out.println("1.✌️ 2.✊ 3.✋ 4.종료");
            System.out.print("입력>");
            String user = scanner.nextLine();

            int u = Integer.parseInt(user);

            if (u == 4) {
                // 4.종료 선택시 프로그램 종료
                break;
            }

            // 2.컴퓨터는 랜덤하게 가위,바위,보 중에 고르기
            Random random = new Random();
            int com = random.nextInt(3) + 1;
            switch (com) {
                case 1 -> {
                    System.out.println("컴퓨터 : ✌️");
                }
                case 2 -> {
                    System.out.println("컴퓨터 : ✊");
                }
                case 3 -> {
                    System.out.println("컴퓨터 : ✋");
                }
            }
            // 3.사용자와 컴퓨터 간의 결과(이김,비김,짐) 출력하기
            if (u == com) {
                // 비김
                System.out.println("🤝 비겼습니다.");
            } else if (u == 1 && com == 3) {
                // 이김
                System.out.println("🎉 이겼습니다.");
            } else if (u == 2 && com == 1) {
                // 이김
                System.out.println("🎉 이겼습니다.");
            } else if (u == 3 && com == 2) {
                // 이김
                System.out.println("🎉 이겼습니다.");
            } else {
                // 짐
                System.out.println("😵 졌습니다.");
            }
        }

        System.out.println("게임 종료");


    }
}