package ch05.lecture;

public class C02Array {
    public static void main(String[] args) {
        // 배열은 여러 개의 값을 가짐
        int[] a;
        a = new int[5];
        a[0] = 9;
        a[1] = 5;
        a[2] = 33;
        a[3] = 66;
        a[4] = 77;

        System.out.println("a[0] = " + a[0]);
        System.out.println("a[1] = " + a[1]);
        System.out.println("a[2] = " + a[2]);
        System.out.println("a[3] = " + a[3]);
        System.out.println("a[4] = " + a[4]);

        System.out.println("-- 반복문 ---");
        for (int i = 0; i < 5; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}