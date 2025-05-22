package ch17.lecture.p02terminal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App07 {
    public static void main(String[] args) {
        // groupingBy, reduce 동시에

        List<String> list = List
                .of("java", "css", "react", "vue", "spring", "javascript", "sql");

        Map<String, List<String>> result1 = list.stream()
                .collect(Collectors.groupingBy(s -> s.length() % 2 == 0 ? "짝" : "홀"));

        result1.forEach((k, v) -> System.out.println(k + ":" + v));

        System.out.println();
        Map<String, Long> result2 = list.stream()
                .collect(Collectors
                        .groupingBy(s -> s.length() % 2 == 0 ? "짝" : "홀",
                                Collectors.counting()));

        result2.forEach((k, v) -> System.out.println(k + ":" + v));

    }
}