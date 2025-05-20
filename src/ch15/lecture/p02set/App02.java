package ch15.lecture.p02set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App02 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Spring");
        set.add("react");
        set.add("mySql");
        set.add("html");
        // 전체 탐색

        // enhanced for
        System.out.println("------enhanced for------");
        for (String item : set) System.out.println(item);

        // forEach
        System.out.println("------forEach------");
        set.forEach(e -> System.out.println(e));
//        set.forEach(System.out::println);

        // stream
        System.out.println("------stream------");
        set.stream().forEach(System.out::println);

        // Iterator
        System.out.println("------Iterator------");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }
    }
}
