package ch17.lecture.p03intermediate;

import java.util.List;

public class App01 {
    public static void main(String[] args) {
        // 중간연산 (intermediate)
        // Stream 리턴

        List<Integer> list
                = List.of(9, 1, 3, 5, 10, 11, 15, 16, 200, 30, 12, 11, 1, 9, 5, 3);

        // filter : 조건의 맞는 요소만 남김
        long count = list.stream()
                .filter(a -> a < 10)
                .count();
        System.out.println("count = " + count);

        long count1 = list.stream()
                .filter(a -> a > 100)
                .count();
        System.out.println("count1 = " + count1);

        long count2 = list.stream()
                .filter(a -> a % 2 == 0)
                .count();
        System.out.println("count2 = " + count2);


        // distinct : 중복 제거
        long count3 = list.stream()
                .distinct()
                .count();
        System.out.println("count3 = " + count3);


        // sorted : 정렬
        list.stream()
                .sorted()
                .forEach(s -> System.out.println(s));

        System.out.println();
        list.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println();
        list.stream()
                .distinct()
                .sorted((a, b) -> b - a)
                .forEach(System.out::println);

        // limit : 앞에 n개만
        System.out.println();
        list.stream()
                .limit(5)
                .forEach(System.out::println);

        System.out.println();
        list.stream()
                .limit(3)
                .forEach(System.out::println);

        System.out.println();
        list.stream()
                .sorted()
                .distinct()
                .limit(3)
                .forEach(System.out::println);

        System.out.println();
        list.stream()
                .distinct()
                .sorted((a, b) -> b - a)
                .limit(3)
                .forEach(System.out::println);

        System.out.println();
        list.stream()
                .limit(3)
                .sorted((a, b) -> b - a)
                .distinct()
                .forEach(System.out::println);

        // skip : 앞에 n개 건너뛰고
        System.out.println();
        list.stream()
                .skip(2)
                .limit(5)
                .forEach(System.out::println);

        System.out.println();
        list.stream()
                .sorted()
                .distinct()
                .skip(1)
                .limit(1)
                .forEach(System.out::println);

        // map : 요소 변환(mapping)
        System.out.println();
        list.stream()
                .map(a -> a * 100)
                .forEach(System.out::println);

        System.out.println();
        list.stream()
                .map(a -> a + "달러")
                .forEach(System.out::println);

        System.out.println();
        list.stream()
                .sorted((a, b) -> b - a)
                .limit(3)
                .map(a -> a + "원")
                .forEach(System.out::println);

    }
}