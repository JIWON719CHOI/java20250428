package ch15.lecture.p06etc;

import java.util.*;

public class CollectionSummaryExample {
    public static void main(String[] args) {
        // 1. 불변 List
        List<String> immutableList = List.of("apple", "banana", "cherry");
        System.out.println("📦 불변 List: " + immutableList);
        // immutableList.add("grape"); // 예외 발생! UnsupportedOperationException

        // 2. 불변 Set
        Set<Integer> immutableSet = Set.of(10, 20, 30);
        System.out.println("📦 불변 Set: " + immutableSet);
        // Set.of(10, 10); // 예외 발생! IllegalArgumentException (중복 안됨)

        // 3. 불변 Map (최대 10쌍)
        Map<String, Integer> immutableMap = Map.of("apple", 1, "banana", 2);
        System.out.println("📦 불변 Map: " + immutableMap);

        // 4. 10쌍 이상 불변 Map 만들기
        Map<String, Integer> bigImmutableMap = Map.ofEntries(
                Map.entry("a", 1),
                Map.entry("b", 2),
                Map.entry("c", 3),
                Map.entry("d", 4),
                Map.entry("e", 5),
                Map.entry("f", 6),
                Map.entry("g", 7),
                Map.entry("h", 8),
                Map.entry("i", 9),
                Map.entry("j", 10),
                Map.entry("k", 11)
        );
        System.out.println("📦 큰 불변 Map: " + bigImmutableMap);

        // 5. copyOf 사용: 기존 컬렉션을 불변으로 복사
        List<String> modifiableList = new ArrayList<>(List.of("one", "two"));
        List<String> copiedList = List.copyOf(modifiableList);
        System.out.println("📦 복사된 불변 List: " + copiedList);

        Set<String> modifiableSet = new HashSet<>(Set.of("A", "B"));
        Set<String> copiedSet = Set.copyOf(modifiableSet);
        System.out.println("📦 복사된 불변 Set: " + copiedSet);

        Map<String, String> modifiableMap = new HashMap<>();
        modifiableMap.put("x", "X-ray");
        modifiableMap.put("y", "Yoyo");
        Map<String, String> copiedMap = Map.copyOf(modifiableMap);
        System.out.println("📦 복사된 불변 Map: " + copiedMap);

        // 6. 순서 차이 확인
        List<String> orderedList = new ArrayList<>(List.of("first", "second", "third"));
        Set<String> unorderedSet = new HashSet<>(Set.of("z", "x", "a"));
        Map<String, Integer> unorderedMap = new HashMap<>();
        unorderedMap.put("orange", 5);
        unorderedMap.put("apple", 2);

        System.out.println("\n📝 List 순서 유지: " + orderedList);
        System.out.println("🌀 HashSet 순서 없음: " + unorderedSet);
        System.out.println("🌀 HashMap 순서 없음: " + unorderedMap);

        // 7. 순서를 유지하는 Set / Map
        Set<String> linkedSet = new LinkedHashSet<>(Set.of("one", "two", "three"));
        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put("first", 1);
        linkedMap.put("second", 2);

        System.out.println("✅ LinkedHashSet (입력 순서 유지): " + linkedSet);
        System.out.println("✅ LinkedHashMap (입력 순서 유지): " + linkedMap);

        // 8. 정렬되는 TreeSet / TreeMap
        Set<String> sortedSet = new TreeSet<>(Set.of("banana", "apple", "cherry"));
        Map<String, Integer> sortedMap = new TreeMap<>(Map.of("c", 3, "a", 1, "b", 2));

        System.out.println("🔠 TreeSet (정렬 순): " + sortedSet);
        System.out.println("🔠 TreeMap (키 정렬 순): " + sortedMap);
    }
}

