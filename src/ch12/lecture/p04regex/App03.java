package ch12.lecture.p04regex;

import java.util.regex.Pattern;

public class App03 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-zA-Z0-9_]", "q")); //영문대소문자,숫자,언더스코어
        // \w : [a-zA-Z0-9_]
        // 자바에서 "" 안에 \는 \\로 사용해야 함
        System.out.println(Pattern.matches("\\w", "q")); //영문대소문자,숫자,언더스코어
        System.out.println(Pattern.matches("\\w\\w", "qq")); //영문대소문자,숫자,언더스코어
        System.out.println(Pattern.matches("\\w\\w\\w", "qqq")); //영문대소문자,숫자,언더스코어
        System.out.println(Pattern.matches("\\w\\w\\w", "qq")); //영문대소문자,숫자,언더스코어
    }
}