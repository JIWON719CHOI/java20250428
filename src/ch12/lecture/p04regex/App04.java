package ch12.lecture.p04regex;

import java.util.regex.Pattern;

public class App04 {
    public static void main(String[] args) {
        // {n,m} : n개에서 m개 사이 수량

        // 영문대소문자,숫자,언더스코어 가 2~4개
        System.out.println(Pattern.matches("\\w{2,4}", "a0_"));
        System.out.println(Pattern.matches("\\w{2,4}", "9Aw"));
        System.out.println(Pattern.matches("\\w{2,4}", "9Awq"));
        System.out.println(Pattern.matches("\\w{2,4}", "9A"));
        System.out.println(Pattern.matches("\\w{2,4}", "9")); // false
        System.out.println(Pattern.matches("\\w{2,4}", "99calq")); // false

        // {n} : 정확히 n개
        // {n,} : n개 이상
        System.out.println(Pattern.matches("\\w{2}", "9c"));
        System.out.println(Pattern.matches("[가-힣]{3,}", "손흥민"));
        System.out.println(Pattern.matches("[가-힣]{3,}", "일론머스크"));
        System.out.println(Pattern.matches("[가-힣]{3,}", "일론 머스크"));
        System.out.println(Pattern.matches("[가-힣 ]{3,}", "일론 머스크"));

    }
}