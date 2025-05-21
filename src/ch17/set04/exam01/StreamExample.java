package ch17.set04.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        // List Collection
        List<Product> list = IntStream.rangeClosed(0, 5).mapToObj(i -> new Product(i, "🎁" + i, "🧑‍💼", (int) (10000 * Math.random()))).toList();

        // 객체 스트림 얻기
        Stream<Product> stream = list.stream();
        stream.forEach(System.out::println);
    }
}
