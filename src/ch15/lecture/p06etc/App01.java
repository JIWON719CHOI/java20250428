package ch15.lecture.p06etc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App01 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        // ArrayList : 내부에 Array 사용. 중간 요소를 찾는 것 빠름.
        //             중간에 요소를 추가/삭제 하는 것은 느린

        // LinkedList : 내부에 doubly linked list (양쪽으로 연결된 객체들) 사용
        //              중간 요소를 찾는 것 느림. 중간에 요소를 추가/삭제하는 것은 빠른 편

        long s1 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list1.add(0, "Array");
        }
        long e1 = System.nanoTime();

        long s2 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list2.add(0, "Linked");
        }
        long e2 = System.nanoTime();

        System.out.println(e1 - s1); // ArrayList 맨 앞에 요소 추가
        System.out.println(e2 - s2); // LinkedList 맨 앞에 요소 추가
    }
}
