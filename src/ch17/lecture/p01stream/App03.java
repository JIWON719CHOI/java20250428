package ch17.lecture.p01stream;

import java.util.List;
import java.util.stream.Stream;

public class App03 {
    public static void main(String[] args) {
        // Stream : 데이터의 흐름
        List<Integer> list = List.of(8, 5, 6, 1, 2, 3);
        Stream<Integer> stream1 = list.stream();
        Stream<Integer> stream2 = stream1.filter(i -> i % 2 == 0);
        long count = stream2.count();

        System.out.println("count = " + count);

        // stream을 재사용할 수 없음
//        stream1.filter(i -> i % 2 == 1);

        // 다른 연산을 할 시 stream을 처음부터 다시 생성해야함
        Stream<Integer> stream3 = list.stream();
        Stream<Integer> stream4 = stream3.filter(i -> i % 2 == 1);
        long count1 = stream4.count();
        System.out.println("count1 = " + count1);

    }
}