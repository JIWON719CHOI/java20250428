package ch15.lecture.p06etc;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App02 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new TreeSet<>();

        // Set : 중복된 요소가 없다.

        // HashSet : 전체 탐색 순서가 보장되지 않는다.
        // TreeSet : 탐색 순서가 보장된다.(natural ordering 또는 Comparator)

        set1.add("java");
        set1.add("spring");
        set1.add("css");
        set1.add("html");
        set1.add("sql");

        set2.add("java");
        set2.add("spring");
        set2.add("css");
        set2.add("html");
        set2.add("sql");

        System.out.println(set1);
        System.out.println(set2);

    }
}