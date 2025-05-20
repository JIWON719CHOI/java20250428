package leetCode.Sensei.p287;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int findDuplicate(int[] nums) {
        // nums 의 모든 요소를 탐색해서 set에 넣고
        // 넣을 때 결과가 false면 이미 있던 값이니까 리턴

        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.add(n)) {
                return n;
            }
        }
        return 0;
    }
}