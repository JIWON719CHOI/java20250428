package ch12.exercise.p17;

import java.util.regex.Pattern;

public class PatternMatcherExample {
    public static void main(String[] args) {
        //정규 표현식을 이용해 첫 번째는 알파벳으로 시작하고 두 번째부터 숫자와 알파벳으로 구성된
        //8〜12자 사이의 ID 값인지 검사하고 싶습니다. 알파벳은 대소문자를 모두 허용한다고 할 때，다음
        //밑줄에 들어갈 코드를 작성해보세요.
        String id = "5Angel1004";
        String regExp = "(^[a-zA-z][a-zA-Z0-9]{7,11}$)";
        boolean isMatch = Pattern.matches(regExp, id);
        if (isMatch) System.out.println("OK");
        else System.out.println("NO!");

        // ^	                시작
        // [a-zA-Z]	            첫 글자: 알파벳
        // [a-zA-Z0-9]{7,11}	그 뒤로 알파벳/숫자 711개 → 총 812자
        // $	                끝
    }
}
