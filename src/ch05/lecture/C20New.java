package ch05.lecture;

public class C20New {
    public static void main(String[] args) {
        // new : 새 객체(instance)가 만들어진 공간을 마련하고 참조값을 결과로 둠
        int[] a;
        a = new int[]{3, 4};

        int[] c;
        c = a;


        int b;
        b = 3;

        int d;
        d = b;

        System.out.println(b == d); // true 값 비교
        System.out.println(a == c); // true 참조값 비교

    }
}
