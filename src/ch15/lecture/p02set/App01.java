package ch15.lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class App01 {
    public static void main(String[] args) {
        // Set : 같은 객체를 여러번 저장할 수 없음
        //       탐색 순서가 보장되지 않음

        Set<String> set = new HashSet<>();

        // 요소(element) 추가
        set.add("java");
        boolean r1 = set.add("spring");
        System.out.println("r1 = " + r1);
        set.add("html");
        System.out.println(set);
        set.add("css");
        System.out.println(set);
        boolean r2 = set.add("spring");
        System.out.println("r2 = " + r2);
        System.out.println(set);
        set.add(null);
        System.out.println(set);
        set.add(null);
        System.out.println(set);

        // 요소 삭제
        boolean r3 = set.remove("spring");
        System.out.println("r3 = " + r3);
        System.out.println(set);
        set.remove(null);
        System.out.println(set);
        boolean r4 = set.remove("react");
        System.out.println("r4 = " + r4);
        System.out.println(set);
//        set.remove(3)

        // 요소의 갯수 확인
        int size = set.size();
        System.out.println("size = " + size);
        boolean r5 = set.isEmpty();
        System.out.println("r5 = " + r5);
        boolean r6 = !set.isEmpty();
        System.out.println("r6 = " + r6);

        // 전체 탐색하기
    }
}