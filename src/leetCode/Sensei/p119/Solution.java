package leetCode.Sensei.p119;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> prev;
        List<Integer> current = new ArrayList<>();
        current.add(1);

        for (int currentIndex = 0; currentIndex < rowIndex; currentIndex++) {
            prev = current;
            current = new ArrayList<>();
            current.add(1); // 처음
            // 이 전 행의 각 값들을 더해서 넣고
//        current.add(prev.get(0) + prev.get(1));
//        current.add(prev.get(1) + prev.get(2));
//        current.add(prev.get(2) + prev.get(3));
//
//        ...
//        current.add(prev.get(i) + prev.get(i + 1));
//
//        ...
//        current.add(prev.get(prev.size() - 2) + prev.get(prev.size() - 1));
            for (int i = 0; i <= prev.size() - 2; i++) {
                current.add(prev.get(i) + prev.get(i + 1));
            }

            current.add(1); // 마지막
        }

        return current;

    }
}