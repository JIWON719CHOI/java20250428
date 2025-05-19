package leetCode.Sensei.p1431;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Integer> kids = Arrays.stream(candies).boxed().toList();

        // 1. kids List 에서 가장 큰 값 구하기
        int max = 0;
        for (Integer c : kids) {
            max = Math.max(max, c);
        }

        // 2. List<Boolean> result 객체 만들기
        List<Boolean> result = new ArrayList<>();

        // 3. kids의 각 요소에 extraCandy 더해서 (1에서 구한 가장 큰값)보다 크거나 같으면
        //    result에 true 추가
        //    아니면 false 추가
        for (Integer c : kids) {
            if (c + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        // result 리턴
        return result;
    }
}
