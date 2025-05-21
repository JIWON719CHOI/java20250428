package ch15.lecture.p06etc;

import java.util.Set;
import java.util.TreeSet;

public class App03 {
    public static void main(String[] args) {
        // TreeSet : 원소들이 natural ordering(Comparable) 으로 정렬됨
        Set<String> set1 = new TreeSet<>();

        set1.add("java");
        set1.add("css");
        set1.add("sql");
        System.out.println(set1);

        Set<Integer> set2 = new TreeSet<>();

        set2.add(300);
        set2.add(100);
        set2.add(500);

        System.out.println(set2);

        Integer v1 = 100;
        Integer v2 = 300;
        Integer v3 = 100;

        System.out.println(v1.compareTo(v2)); // 음수
        System.out.println(v2.compareTo(v1)); // 양수
        System.out.println(v1.compareTo(v3)); // 0
        System.out.println(v3.compareTo(v1)); // 0

        String s1 = "java";
        String s2 = "css";
        System.out.println(s1.compareTo(s2)); // 양수
        System.out.println(s2.compareTo(s1)); // 음수
        System.out.println(s1.compareTo("java")); // 0
    }
}