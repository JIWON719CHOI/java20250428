package ch12.practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String s = scanner.nextLine();
        boolean isValid = s.replaceAll("[^가-힣]", "").length() >= 3;

        if (isValid) {
            System.out.println("✅ 한글이 3글자 이상입니다.");
        } else {
            System.out.println("❌ 한글이 3글자 미만입니다.");
        }

        scanner.close();
    }
}
