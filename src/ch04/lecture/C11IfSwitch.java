package ch04.lecture;

import java.util.Scanner;

public class C11IfSwitch {
    public static void main(String[] args) {
        // if : 범위 비교

        Scanner scanner = new Scanner(System.in);
        int score = Integer.parseInt(scanner.nextLine());

        if (score <= 100 && score >= 80) System.out.println("최우수");
        else if (score >= 70) System.out.println("우수");
        else if (score >= 50) System.out.println("양호");
        else System.out.println(score >= 0 ? "미흡" : "다시 입력하세요.");
    }
}
