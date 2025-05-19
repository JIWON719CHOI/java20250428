package leetCode.Sensei.p1200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<Integer> input = new ArrayList<>();
        for (int n : arr) {
            input.add(n);
        }

        List<List<Integer>> result = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        // 1. input 정렬
        Collections.sort(input);

        // 2. 인접한 두 값의 차가 가장 적은 차이를 구해서 저장
        for (int i = 0; i < input.size() - 1; i++) {
            Integer n1 = input.get(i);
            Integer n2 = input.get(i + 1);

            int diff = n2 - n1;

            min = Math.min(min, diff);
        }

        // 3. 인접한 두 값의 차가 (2)에서 구한 값과 같으면
        for (int i = 0; i < input.size() - 1; i++) {
            Integer n1 = input.get(i);
            Integer n2 = input.get(i + 1);
            int diff = n2 - n1;
            if (diff == min) {
                //    두 값을 원소로 갖는 List를 만들어서
                //    결과 list에 추가 하기
                List<Integer> row = new ArrayList<>();
                row.add(n1);
                row.add(n2);

                result.add(row);
            }
        }
        return result;
    }
}