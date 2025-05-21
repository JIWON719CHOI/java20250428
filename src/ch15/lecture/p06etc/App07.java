package ch15.lecture.p06etc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App07 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("java");
        list1.add("css");
        list1.add("spring");

        System.out.println(list1);

        // 요소(element)의 목록으로 list 만들기
        List<Object> list2 = List.of(); // empty
        System.out.println(list2);

        List<String> list3 = List.of("java");
        System.out.println(list3);

        List<String> list4 = List.of("java", "css", "spring");
        System.out.println(list4);

        List<Integer> list5 = List.of(100, 50, 500, 200);
        System.out.println(list5);

        // Set.of : 요소의 나열로 set 만듦
        Set<String> set1 = Set.of("java", "css", "spring");
        System.out.println(set1);


        // Map.of : entry의 나열로 map 만듦
        Map<String, String> map1 = Map.of(
                "python", "django",
                "java", "spring",
                "js", "next");
        System.out.println(map1);
    }
}