package leetCode.Sensei.p2206;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        // nums 에 있는 요소들의 갯수 세기
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }

        // map을 전체 탐색해서 value가 모두 짝수인지 확인
        for (Integer value : map.values()) {
            if (value % 2 == 1) {
                return false;
            }
        }

        return true;
    }
}