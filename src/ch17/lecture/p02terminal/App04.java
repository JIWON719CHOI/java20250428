package ch17.lecture.p02terminal;

import java.util.List;

public class App04 {
    public static void main(String[] args) {
        // reduce : 집계 연산

        List<String> list = List.of("java", "spring", "css", "html", "sql");

        // 모든 요소 연결
        String r1 = list.stream()
                .reduce("", (a, b) -> a + b);
        System.out.println("r1 = " + r1);

        Integer r2 = list.stream()
                .map(String::length)
                .reduce(0, Integer::sum);

        System.out.println("r2 = " + r2);

    }

}