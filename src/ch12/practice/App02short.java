package ch12.practice;

public class App02short {
    public static void main(String[] args) {
        System.out.println(new java.util.Scanner(System.in).nextLine().matches("^[가-힣]{3,}$"));

        // new Scanner(System.in)	    사용자 입력 받기
        // .nextLine()	                한 줄 입력 받기
        // .matches("^[가-힣]{3,}$")	정규식으로 검사 – 한글 3글자 이상
        // System.out.println(...)	    결과(true/false)를 출력

        // ^	    문자열의 시작을 의미해요. "처음부터 검사한다"는 뜻이에요.
        // [가-힣]	한글 한 글자. "가"부터 "힣"까지 한글 글자 하나를 의미해요.
        // {3,}	    앞에 있는 [가-힣]이 3개 이상 반복된다는 뜻이에요.
        // $	    문자열의 끝을 의미해요. 즉 "끝까지 검사한다"는 뜻이에요.
    }
}
