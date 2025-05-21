package ch17.lecture.p02terminal;

import java.util.List;
import java.util.Optional;

public class App01 {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 1, 0, 6, 7, 8, 9, 11);

        // 최종연산

        // count : 요소의 갯수 리턴
        long count = list.stream()
                .count();
        System.out.println("count = " + count);

        // min : 가장 작은 요소 리턴
        Optional<Integer> min = list.stream()
                .min((a, b) -> a - b);
        System.out.println("min = " + min);

        // max : 가장 큰 요소 리턴
        Optional<Integer> max = list.stream()
                .max((a, b) -> a - b);
        System.out.println("max = " + max);

        // forEach : 각 요소를 처리함
        list.stream()
                .forEach(s -> System.out.println(s));
    }
}