package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class App06 {
    public static void main(String[] args) {
        List<List<String>> l1 = new ArrayList<>();
        List<String> r1 = new ArrayList<>();
        r1.add("hello");
        r1.add("java");

        List<String> r2 = new ArrayList<>();
        r2.add("hi");
        r2.add("python");

        l1.add(r1);
        l1.add(r2);

        String s = l1.get(0).get(0);
        System.out.println("s = " + s); // hello

        List<List<String>> l2 = new ArrayList<>();
        l2.add(l1.get(0));
        l2.add(l1.get(1));

        l2.get(0).set(1, "react");
        System.out.println("l2 = " + l2);
        System.out.println("l1 = " + l1);

        r2.set(0, "안녕");
        System.out.println("r2 = " + r2);

        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);

    }
}