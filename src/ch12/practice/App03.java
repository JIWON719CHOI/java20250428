package ch12.practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App03 {
    public static void main(String[] args) {
        // 사용자 입력 받아서
        // 유효한 전화번호인지 확인
        // 아래 번호들은 패턴에 일치하는 것들
        // 01099998888
        // 010-9999-8888
        // 010 9999 8888
        // 010 99998888

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String num = "^010(-| )?\\d{4}(-| )?\\d{4}";
        boolean result = Pattern.matches(input, num);

        if (result) System.out.println("OK!");
        else System.out.println("NO!");

        scanner.close();
    }
}
