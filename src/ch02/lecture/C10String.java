package ch02.lecture;

public class C10String {
    public static void main(String[] args) {
        // 특수기호

        // \n : 새로운 줄
        // \t : 띄어쓰기
        // \" : 큰 따옴표
        // \\ : 역슬래시

        String a = "abc\ndef";
        System.out.println(a);
        a = "abc\tdef";
        System.out.println(a);
        a = "abc\"java\"";
        System.out.println(a);
        a = "\\java\\";
        System.out.println(a);
    }
}
