package leetCode.Sensei.p1748;

import java.util.Arrays;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

public class SolutionStream {
    public int sumOfUnique(int[] nums) {

        return Arrays.stream(nums)
                .boxed() // int → Integer
                .collect(groupingBy(identity(), counting())) // 숫자별 등장 횟수 세기
                // .collect(groupingBy(n -> n, counting())) 이게 그거. 그리고 static 으로 줄였음.
                .entrySet().stream() // Map<Entry<Integer, Long>>로 변환
                .filter(e -> e.getValue() == 1) // 딱 1번만 등장한 값만 필터링
                .mapToInt(Map.Entry::getKey) // key 값만 추출
                .sum(); // 모두 더하기
    }

}
