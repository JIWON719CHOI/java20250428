package ch15.exercise.p09;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null; // 최고 점수를 받은 아이디를 저장하는 변수
        int maxScore = 0; // 최고 점수를 저장하는 변수
        int totalScore = 0; // 점수 합계를 저장하는 변수

        // 👉 map에 들어있는 모든 (이름, 점수) 쌍을 하나씩 꺼내기 위한 반복문.
        //    entrySet()은 전체 데이터 묶음을 꺼냄.
        for (Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey(); // 👉 현재 반복 중인 사람의 이름(아이디)을 가져옴.
            int score = entry.getValue(); // 👉 현재 사람의 점수를 가져옴.

            totalScore += score; // 👉 전체 점수 합계에 이번 점수를 더함.

            if (score > maxScore) { //👉 이번 점수가 지금까지 최고 점수보다 크면,
                maxScore = score; // 👉 최고 점수랑 이름을 새로 저장함.
                name = key;
            }
        }

        int average = totalScore / map.size(); // 👉 평균 점수 계산: 전체 합계를 인원 수로 나눔.

        System.out.println("average Score: " + average);
        System.out.println("max Score: " + maxScore);
        System.out.println("max Score id: " + name);
    }
}
