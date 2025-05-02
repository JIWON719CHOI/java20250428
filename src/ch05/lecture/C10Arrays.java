package ch05.lecture;

import java.util.Arrays;

public class C10Arrays {
    public static void main(String[] args) {
        // Arrays : 배열을 조작하는 유용한 메소드를 가진 클래스

        // copyOf
        int[] a = {8, 1, 2};
        int[] b = Arrays.copyOf(a, a.length);

        a[0] = 88;
        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "] = " + b[i]);
        }

        // toString : 배열 내의 값들로 문자열 생성해서 리턴
        String arr = Arrays.toString(a);
        String brr = Arrays.toString(b);
        System.out.println("arr = " + arr);
        System.out.println("brr = " + brr);

        // fill : 특정값으로 배열을 채움
        int[] c = new int[5];
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c));
        Arrays.fill(c, 100);
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c));


        // sort : 배열 내의 원소(아이템)들을 정렬함
        int[] d = {9, -1, 2, -3, 0, 8};
        System.out.println(Arrays.toString(d));
        Arrays.sort(d);
        System.out.println(Arrays.toString(d));

        // equals : 두 배열의 값과 순서 같은 지 확인
        int[] e = {5, 7, 9};
        int[] f = {9, 7, 5};
        boolean r1 = Arrays.equals(e, f);
        System.out.println("r1 = " + r1);
        Arrays.sort(f);
        boolean r2 = Arrays.equals(e, f);
        System.out.println("r2 = " + r2);

    }
}