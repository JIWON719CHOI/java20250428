package ch12.sec10;

import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        String regExp = "(02|010)-\\d{3,4}-\\d{4}";
        String data = "010-123-4567";
        boolean result = Pattern.matches(regExp, data);
        if (result) {
            System.out.println("MATCH!");
        } else {
            System.out.println("UN MATCH!");
        }
        regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
        data = "angel@mycompanycom";
        result = Pattern.matches(regExp, data);
        if (result) {
            System.out.println("MATCH!");
        } else {
            System.out.println("UN MATCH!");
        }
    }
}
