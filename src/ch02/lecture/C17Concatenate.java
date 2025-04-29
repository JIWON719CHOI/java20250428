package ch02.lecture;

public class C17Concatenate {
    public static void main(String[] args) {
        // + :  문자열 연결 연산
        String a = "java";
        String b = "Script";

        String c = a + b;
        System.out.println(c);
        System.out.println("(a+b) = " + (a + b));

        String d = "react";
        String e = a + b + d;
        String f = (a + b) + d;
        System.out.println("f = " + f);
        String g = a + (b + d);
        System.out.println("g = " + g);

        // 다른 타입과 문자열을 + 연산하면 연결연산

        String h = "java";
        int i = 300;
        String j = h + i;
        System.out.println("j = " + j);

        String k = "500";
        int l = 400;

        String m = k + l; // 더한 결과 String
        System.out.println("m = " + m);

        int n = 200;
        int o = 300;
        String p = "400";

        String q = n + o + p; // 500 400
        System.out.println("q = " + q);

        String s = n + (o + p); // 200 300 400
        System.out.println(s);

    }
}
