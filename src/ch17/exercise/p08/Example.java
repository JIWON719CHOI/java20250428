package ch17.exercise.p08;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(new Member("HONG", "DEV"), new Member("KIM", "DES"), new Member("SHIN", "DEV"));

        Map<String, List<Member>> gropingMap = list.stream().collect(Collectors.groupingBy(Member::getJob));

        System.out.println("🧑‍💻");
        List<Member> devList = gropingMap.get("DEV");
        devList.forEach(s -> System.out.println(s.toString()));

        System.out.println();

        System.out.println("👩‍🎨");
        List<Member> desList = gropingMap.get("DES");
        desList.forEach(s -> System.out.println(s.toString()));
    }
}
