package ch15.sec08;

import java.util.*;

public class ImmutableExample {
    public static void main(String[] args) {
        // List Immutable Collection
        List<String> immutableList1 = List.of("A", "B", "C");
//        immutableList1.add("D"); NO!!

        // Set Immutable Collection
        Set<String> immutableSet1 = Set.of("A", "B", "C");
//        immutableSet1.remove("A"); NO!!

        // Map Immutable Collection
        Map<Integer, String> immutableMap1 = Map.of(1, "A", 2, "B", 3, "C");
//        immutableMap1.put(4, "D"); NO!

        // List Collection을 Immutable Collection 으로 Copy
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        List<String> immutableList2 = List.copyOf(list);

        // Set Collection을 Immutable Collection 으로 Copy
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        Set<String> immutableSet2 = Set.copyOf(set);

        // Map Collection을 Immutable Collection 으로 Copy
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        Map<Integer, String> immutableMap2 = Map.copyOf(map);

        // 배열로부터 List Immutable Collection 생성
        String[] arr = {"A", "B", "C"};
        List<String> immutableList3 = Arrays.asList(arr);


    }
}
