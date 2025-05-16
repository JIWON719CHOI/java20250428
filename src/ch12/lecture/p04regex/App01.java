package ch12.lecture.p04regex;

import java.util.regex.Pattern;

public class App01 {
    public static void main(String[] args) {
        // 정규표현식(regex, Regular Expression)
        // 문자열의 패턴을 표현하는 문자열

        // 글자 하나 패턴
        String pattern = "a";

        // 검증 텍스트
        String s1 = "a";

        // Pattern.matches(regex, input) : input이 regex에 맞으면 true
        boolean r1 = Pattern.matches(pattern, s1);
        System.out.println("r1 = " + r1);

        System.out.println(Pattern.matches(pattern, "aa"));
        System.out.println(Pattern.matches(pattern, " a "));

        System.out.println(Pattern.matches("aa", "aa")); // true
        System.out.println(Pattern.matches("ab", "ab")); // true
        System.out.println(Pattern.matches("ab", "ba")); // false
    }
}