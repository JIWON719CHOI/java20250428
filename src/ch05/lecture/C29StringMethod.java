package ch05.lecture;

public class C29StringMethod {
    public static void main(String[] args) {
        // toCharArray : 문자열(String)을 문자(char)배열로 리턴
        String a = "hello world";
        char[] c = a.toCharArray();

        System.out.println("a.length() = " + a.length());
        System.out.println("c.length = " + c.length);

        System.out.println(c[0]); // h
        System.out.println(c[1]); // e
        System.out.println(c[5]); // 스페이스
        System.out.println(c[c.length - 1]); // d

        // charAt() : 특정 index의 문자(char)를 리턴
        String b = "hello world";
        char c1 = b.charAt(0);
        System.out.println("c1 = " + c1);
        char c2 = b.charAt(5);
        System.out.println("c2 = " + c2);
        char c3 = b.charAt(b.length() - 1);
        System.out.println("c3 = " + c3);


    }
}