package leetCode.Sensei.p1046;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for (int s : stones) {
            list.add(s);
        }

        // 1. 정렬
        while (list.size() > 1) {
            Collections.sort(list);

            // 2. 마지막 index의 요소와, 마지막-1 index의 요소를 꺼내고(지우고)
            Integer s1 = list.removeLast();
            Integer s2 = list.removeLast();
            // 3. 차이를 구해서 list에 다시 넣고(이 때 차이가 0이면 넣지 않음)
            int diff = s1 - s2;
            if (diff != 0) {
                list.add(diff);
            }
        }
        // 1번부터 다시 시작
        // 하나만 남을 때까지 반복해서, 하나남은 값을 리턴

        if (list.isEmpty()) {
            return 0;
        }

        return list.getFirst();
    }
}