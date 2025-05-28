package ch21.sec01;

import ch15.sec05.exam03.Person;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class VarExample2 {
    public static void main(String[] args) {
        method1();
        method2();
    }

    // 전통적 방식대로 키와 값의 타입을 명시적으로 작성한 메소드
    public static void method1() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("SHIN", 85);
        map.put("HONG", 90);
        map.put("DONG", 80);

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }
        System.out.println("--------------");
    }


    // 예약된 타입 var 를 사용한 메소드
    public static void method2() {
        var map = new HashMap<String, Integer>();
        map.put("SHIN", 85);
        map.put("HONG", 90);
        map.put("DONG", 80);

        var entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            var key = entry.getKey();
            var value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
