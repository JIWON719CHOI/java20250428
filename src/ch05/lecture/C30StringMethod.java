package ch05.lecture;

public class C30StringMethod {
    public static void main(String[] args) {
        // 끝의 빈 문자(white space) 삭제

        String a = "hello world";
        System.out.println(a);
        String b = a.trim();
        System.out.println(b);

        String c = a.strip();
        System.out.println(c);

        String z = "\u2002Hello\u2002";
        String x = z.trim();
        String y = z.strip();
        System.out.println(x);
        System.out.println(y);
    }
}
