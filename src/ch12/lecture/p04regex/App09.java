package ch12.lecture.p04regex;

import java.util.regex.Pattern;

public class App09 {
    public static void main(String[] args) {
        // | : or

        System.out.println(Pattern.matches("(ab|12)", "ab"));
        System.out.println(Pattern.matches("(ab|12)", "12"));
        System.out.println(Pattern.matches("(ab|12)+", "12"));
        System.out.println(Pattern.matches("(ab|12)+", "12ab1212abab12"));

    }
}