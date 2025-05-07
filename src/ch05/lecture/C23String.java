package ch05.lecture;

public class C23String {
    public static void main(String[] args) {
        // 생성자 사용

        String a = "java"; // literal
        String b = new String("java"); // new
        System.out.println(a.equals(b)); // true

        // char 배열
        char[] c1 = {'j', 'a', 'v', 'a'};
        String c = new String(c1);
        System.out.println(a.equals(c)); //true
        char[] d1 = {'r', 'e', 'j', 'a', 'v', 'a', 't'};
        String d = new String(d1, 2, 4);
        System.out.println(a.equals(d));//true
        int[] e1 = {101, 106, 97, 118, 97, 99};
        String e = new String(e1, 1, 4);
        System.out.println(a.equals(e)); // true
        byte[] f1 = {106, 97, 118, 97};
        String f = new String(f1);
        System.out.println(a.equals(f)); // true
        byte[] g1 = {101, 106, 97, 118, 97, 99};
        String g = new String(g1, 1, 4);
        System.out.println(a.equals(g)); // true
    }
}
