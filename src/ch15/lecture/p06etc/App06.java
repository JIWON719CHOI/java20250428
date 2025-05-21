package ch15.lecture.p06etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App06 {
    public static void main(String[] args) {
        // 배열
        Integer[] arr1 = {10, 5, 30, -1, 0, 20};
        // 정렬 전
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        // 정렬 후
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr1, (a, b) -> a - b);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1, (a, b) -> -(a - b));
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1, (a, b) -> b - a);
        System.out.println(Arrays.toString(arr1));

        String[] arr2 = {"java", "css", "spring"};
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2, (a, b) -> a.compareTo(b));
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2, (a, b) -> -a.compareTo(b));
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2, (a, b) -> b.compareTo(a));
        System.out.println(Arrays.toString(arr2));

        List<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(500);
        list1.add(50);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
        Collections.sort(list1, (a, b) -> a - b);
        System.out.println(list1);
        Collections.sort(list1, (a, b) -> b - a);
        System.out.println(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("java");
        list2.add("css");
        list2.add("spring");
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);
        Collections.sort(list2, (a, b) -> b.compareTo(a));
        System.out.println(list2);

    }
}