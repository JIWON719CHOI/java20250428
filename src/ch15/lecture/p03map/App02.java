package ch15.lecture.p03map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App02 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("java", "spring");
        map.put("python", "django");
        map.put("js", "node");

        // keySet 으로 전체 탐색
        System.out.println("------keySet------");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + ":" + value);
        }
        // entrySet 으로 전체 탐색
        System.out.println("------entrySet------");
//        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":" + value);
        }

        // forEach Method
        System.out.println("------forEach------");
        map.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}
