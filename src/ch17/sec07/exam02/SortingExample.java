package ch17.sec07.exam02;

import java.util.ArrayList;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        // List Collection
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("HONG", 30));
        studentList.add(new Student("SHIN", 10));
        studentList.add(new Student("YUU", 20));

        // 점수를 기준으로 오름차순으로 정리한 새 스트림 얻기
        studentList.stream().sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore())) // score 를 기준으로 올림차순 정렬
                .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
        System.out.println();

        // 점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기
        studentList.stream().sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore())) // score 를 기준으로 올림차순 정렬
                .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
    }
}
