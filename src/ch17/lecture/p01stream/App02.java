package ch17.lecture.p01stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App02 {
    public static void main(String[] args) {
        // Collection의 요소들로 Stream 만들기

        List<Integer> list1 = List.of(3, 1, 0, -1, 10, 5);
        Stream<Integer> stream1 = list1.stream();

        Set<Integer> set1 = Set.of(45, 48, 7, 2, 1, 5);

        Stream<Integer> stream2 = set1.stream();

        Integer[] arr1 = {5, 7, 9, 1, 2, 4, 6};

        Stream<Integer> stream3 = Arrays.stream(arr1);

        Random random = new Random();
        IntStream stream4 = random.ints();

        IntStream stream5 = IntStream.range(0, 100);
    }
}
