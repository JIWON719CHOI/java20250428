package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class App04 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("java");
        list1.add("react");
        System.out.println("list1 = " + list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(50);
        System.out.println("list2 = " + list2);

        List<List<String>> list3 = new ArrayList<>();
        List<String> row1 = new ArrayList<>();
        row1.add("html");
        row1.add("css");

        List<String> row2 = new ArrayList<>();
        row2.add("java");
        row2.add("spring");
        row2.add("jpa");

        list3.add(row1);
        list3.add(row2);

        System.out.println("list3 = " + list3);
    }
}