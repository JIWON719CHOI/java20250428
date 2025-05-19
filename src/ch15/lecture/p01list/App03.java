package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App03 {
    public static void main(String[] args) {
        // Collections 에 유용한 메소드들이 있음

        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("react");
        list.add("spring");
        list.add("css");
        list.add("html");

        System.out.println(list);

        // max : 가장 큰 값 리턴
        String max = Collections.max(list);
        System.out.println("max = " + max);

        // min : 가장 작은 값 리턴
        String min = Collections.min(list);
        System.out.println("min = " + min);

        // reverse : 뒤집기
        Collections.reverse(list);
        System.out.println(list);

        // sort : 정렬하기
        Collections.sort(list);
        System.out.println(list);

        // shuffle : 섞기
        Collections.shuffle(list);
        System.out.println(list);

        // fill : 특정 요소로 모두 교체
        Collections.fill(list, "sql");
        System.out.println(list);
    }
}