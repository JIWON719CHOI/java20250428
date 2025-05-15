package ch12.lecture.p01object;

public class App07 {
    public static void main(String[] args) {
        String a = new String("java");
        String b = new String("java");
        String c = new String("react");

        System.out.println(a.equals(b)); // true
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        System.out.println(a.equals(c)); // false
        System.out.println(c.hashCode());

        // System.identifyHashCode();
        // 재정의 하지 않은 Object의 hashCode 값이 필요할 때
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));

    }
}