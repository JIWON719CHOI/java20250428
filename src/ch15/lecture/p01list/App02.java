package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App02 {
    public static void main(String[] args) {
        // List: 요소의 순서가 있는 콜렉션
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("spring");
        list.add("react");
        list.add("sql");
        list.add("html");

        // 전체탐색
        // for
        System.out.println("-----for-----");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // enhanced for
        System.out.println("-----enhanced for-----");
        for (String item : list) {
            System.out.println(item);
        }

        // Iterator (탐색자)
        System.out.println("-----Iterator----");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }

        // forEach
        System.out.println("----forEach----");
//        list.forEach(x -> System.out.println(x));
        list.forEach(System.out::println);

        // stream (17장)
        System.out.println("----stream-----");
        list.stream()
                .forEach(System.out::println);

    }
}