package ch15.lecture.p03map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App01 {
    public static void main(String[] args) {
        // map: entry(key,value)를 저장
        //  중복된 key를 저장할 수 없음

        Map<String, String> map = new HashMap<>();

        // entry 추가
        map.put("아침", "베이글");
        map.put("점심", "제육");
        map.put("저녁", "돈까스");
        map.put("저녁", "베이글"); // value 덮어씀
        System.out.println(map);

        // 몇 개의 entry가 있는 지
        int size = map.size();
        System.out.println("size = " + size);
        boolean empty = map.isEmpty();
        System.out.println("empty = " + empty);

        // key가 있는 지 확인
        boolean r1 = map.containsKey("아침");
        System.out.println("r1 = " + r1);
        boolean r2 = map.containsKey("간식");
        System.out.println("r2 = " + r2);

        // key로 value 얻기
        String v1 = map.get("아침");
        System.out.println("v1 = " + v1);
        String v2 = map.get("점심");
        System.out.println("v2 = " + v2);
        String v3 = map.get("간식");
        System.out.println("v3 = " + v3);

        // key 집합(set) 얻기
        Set<String> keys = map.keySet();
        System.out.println("keys = " + keys);

        // entry 삭제
        String v4 = map.remove("저녁"); //지운 value 리턴
        System.out.println(map);
        System.out.println("v4 = " + v4);
        String v5 = map.remove("간식");
        System.out.println("v5 = " + v5);


        // value 들 얻기
        map.put("저녁", "베이글");
        Collection<String> values = map.values();
        System.out.println("values = " + values);
    }
}