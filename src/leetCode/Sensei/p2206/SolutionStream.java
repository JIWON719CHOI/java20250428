package leetCode.Sensei.p2206;

import java.util.Arrays;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

public class SolutionStream {
    public boolean divideArray(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(groupingBy(identity(), counting()))
                .values()
                .stream()
                .allMatch(e -> e % 2 == 0);
    }
}
