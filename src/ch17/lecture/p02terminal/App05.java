package ch17.lecture.p02terminal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class App05 {
    public static void main(String[] args) {
        // collect : 요소들을 수집해서 Collection(List, Set, Map)을 결과로 냄
        List<String> list = List.of("java", "spring", "css", "react", "html");

        // List로 수집
        List<Integer> c1 = list.stream().map(s -> s.length()).collect(Collectors.toList());

        System.out.println("c1 = " + c1);

        // Set 으로 수집
        Set<Integer> s1 = list.stream().map(s -> s.length()).collect(Collectors.toSet());

        System.out.println("s1 = " + s1);

        // Map 으로 수집
        Map<String, Integer> m1 = list.stream().collect(Collectors.toMap(s -> s, s -> s.length()));

        System.out.println("m1 = " + m1);

        // List 로 자주 변환함.. -> toList 라는 메소드 사용 가능
        List<Integer> c2 = list.stream().map(String::length).toList();

        System.out.println("c2 = " + c2);


    }
}
