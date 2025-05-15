package ch16.sec05.exam02;

public class Person {
    public void ordering(Comparable comparable) {
        String a = "HONG";
        String b = "KIM";
        int result = comparable.compare(a, b);

        if (result < 0) {
            System.out.println(a + "은" + b + "보다 앞에 온다.");
        } else if (result == 0) {
            System.out.println(a + "은 " + b + "와(과) 같다.");
        } else {
            System.out.println(a + "은 " + b + "보다 뒤에 온다.");
        }
    }
}
