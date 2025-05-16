package ch12.practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App03Short {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("^010([- ]?)\\d{4}\\1\\d{4}", new Scanner(System.in).nextLine()) ? "OK!" : "NO!");

        // new Scanner(System.in).nextLine() → 한 줄 입력받고
        // Pattern.matches(...) → 정규식으로 검사하고
        // 삼항 연산자로 OK!/NO! 출력
        // 정규식 안의 \\1은 앞에서 캡처한 구분자(공백 또는 하이픈)를 동일하게 써야 한다는 뜻이야.
    }
}
