package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        // Map Collection
        Map<String, Integer> map = new HashMap<>();

        // Object save
        map.put("SHIN", 85);
        map.put("HONG", 90); // 키가 같이 때문에 제일 마지막에 저장한 값만 저장
        map.put("DONG", 80);
        map.put("HONG", 95); // 키가 같이 때문에 제일 마지막에 저장한 값만 저장
        System.out.println("\nTOTAL ENTRY : " + map.size());
        System.out.println();

        // Key Value
        String key = "HONG";
        int value = map.get(key); // 키를 매개값으로 주면 값을 리턴
        System.out.println(key + " : " + value);
        System.out.println();

        // key Set Collection 을 얻고, 반복해서 키와 값을 얻기
        Set<String> keySet = map.keySet(); // 키를 반복하기 위해 반복자를 얻음
        Iterator<String> keyIterator = keySet.iterator(); // 키를 반복하기 위해 반복자를 얻음
        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + " : " + v);
        }
        System.out.println();

        // entry Set Collection Get! repeat get key & value
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // 엔트리를 반복하기 위해 반복자를 얻음
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator(); // 엔트리를 반복하기 위해 반복자를 얻음
        while (entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " : " + v);
        }
        System.out.println();

        // 키로 엔트리 삭제
        map.remove("HONG");
        System.out.println("TOTAL ENTRY : " + map.size());
        System.out.println();
    }
}
