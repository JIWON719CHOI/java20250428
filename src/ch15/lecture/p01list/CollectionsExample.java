package ch15.lecture.p01list;

import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("C", "A", "B"));
        List<String> list2 = new ArrayList<>(Arrays.asList("A", "B", "C"));
        List<String> dest = new ArrayList<>(Arrays.asList("X", "X", "X"));

        // 1. sort
        Collections.sort(list);
        System.out.println("sort: " + list);

        // 2. sort with comparator (역순 정렬)
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println("sort with comparator: " + list);

        // 3. reverse
        Collections.reverse(list);
        System.out.println("reverse: " + list);

        // 4. shuffle
        Collections.shuffle(list);
        System.out.println("shuffle: " + list);

        // 5. swap
        Collections.swap(list, 0, 2);
        System.out.println("swap: " + list);

        // 6. rotate
        Collections.rotate(list, 1);
        System.out.println("rotate: " + list);

        // 7. fill
        Collections.fill(dest, "A");
        System.out.println("fill: " + dest);

        // 8. copy
        Collections.copy(dest, list2);
        System.out.println("copy: " + dest);

        // 9. binarySearch
        Collections.sort(list2);
        int idx = Collections.binarySearch(list2, "B");
        System.out.println("binarySearch for 'B': " + idx);

        // 10. max / min
        System.out.println("max: " + Collections.max(list2));
        System.out.println("min: " + Collections.min(list2));

        // 11. frequency
        System.out.println("frequency of 'A': " + Collections.frequency(list2, "A"));

        // 12. disjoint
        boolean isDisjoint = Collections.disjoint(list, Arrays.asList("Z"));
        System.out.println("disjoint with ['Z']: " + isDisjoint);

        // 13. addAll
        List<String> addedList = new ArrayList<>();
        Collections.addAll(addedList, "a", "b", "c");
        System.out.println("addAll: " + addedList);

        // 14. nCopies
        List<String> copyList = Collections.nCopies(3, "apple");
        System.out.println("nCopies: " + copyList);

        // 15. replaceAll
        Collections.replaceAll(list2, "A", "Z");
        System.out.println("replaceAll 'A' -> 'Z': " + list2);

        // 16. unmodifiableList
        List<String> unmodifiable = Collections.unmodifiableList(list2);
        System.out.println("unmodifiableList: " + unmodifiable);
        // unmodifiable.add("X"); // -> 오류 발생

        // 17. synchronizedList
        List<String> syncList = Collections.synchronizedList(new ArrayList<>(list2));
        System.out.println("synchronizedList: " + syncList);
    }
}