package ch17.exercise.p07;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(new Member("HONG", "DEV"), new Member("KIM", "DES"), new Member("SHIN", "DEV"));

        List<Member> developers = list.stream().filter(s -> s.getJob().equals("DEV")).toList();

        developers.forEach(m -> System.out.println(m.getName()));
    }
}
