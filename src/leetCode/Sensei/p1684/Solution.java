package leetCode.Sensei.p1684;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        // allowed에 있는 각 문자(Character)를 저장한 Set 만들기
        // 1. Set 만들고
        Set<Character> set = new HashSet<>();
        // 2. allowed의 각 문자를 탐색해서
        for (char c : allowed.toCharArray()) {
            // 3. Set에 넣고(add)
            set.add(c);
        }

        int count = 0;
        // words에 있는 각 문자열을 전체 탐색해서 각 문자열의 문자가 allowed에 있는 지 확인
        // 1. words의 각 문자열(word) 탐색
        for (String word : words) {
            boolean checked = true;
            //    1. word의 각 문자(character)가
            for (char c : word.toCharArray()) {
                //    2. Set에 있는 지 확인(contains))
                if (!set.contains(c)) {
                    checked = false;
                    break;
                }
            }
            //    3. 모두 다 있으면 count 늘리기
            if (checked) {
                count++;
            }
        }
        // return count
        return count;
    }
}