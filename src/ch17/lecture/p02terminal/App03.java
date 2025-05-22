package ch17.lecture.p02terminal;

import java.util.List;
import java.util.Optional;

public class App03 {
    public static void main(String[] args) {
        // reduce : 집계 연산

        List<String> list = List.of("java", "spring", "css", "html", "sql");


        // 모든 요소 연결
        Optional<String> r1 = list.stream()
                .reduce((a, b) -> a + b);

        System.out.println(r1.orElse(""));

        // 모든 요소의 글자 수 더하기
        Optional<Integer> r2 = list.stream()
                .map(String::length)
                .reduce(Integer::sum);

        System.out.println(r2.orElse(0));


    }
}