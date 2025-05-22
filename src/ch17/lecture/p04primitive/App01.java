package ch17.lecture.p04primitive;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App01 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(3, 5, 9, 7, 11, 20, 22, 11);
        Stream<Integer> stream1 = list1.stream();
        Integer r1 = stream1.reduce(0, (a, b) -> a + b);
        System.out.println("r1 = " + r1);

        // 기본타입을 요소로 갖는 Stream
        // IntStream
        // LongStream
        // DoubleStream

        // 유용한 reduce 메소드 :sum, average, min, max


        int[] arr1 = {3, 5, 9, 7, 11, 20, 22, 11};
        IntStream stream2 = Arrays.stream(arr1);
        int r2 = stream2.reduce(0, (a, b) -> a + b);
        System.out.println("r2 = " + r2);

        IntStream stream3 = Arrays.stream(arr1);
        int r3 = stream3.sum();
        System.out.println("r3 = " + r3);


    }
}