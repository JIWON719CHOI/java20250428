package ch17.sec01.exam01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        // Set Collection
        Set<String> set = new HashSet<>();
        set.add("HONG");
        set.add("SHIN");
        set.add("KIM");

        // Stream 을 이용한 요소 반복 처리
        Stream<String> stream = set.stream(); // 스트림 얻기
        stream.forEach(name -> System.out.println(name)); // 람다식 요소 처리방법
    }
}
