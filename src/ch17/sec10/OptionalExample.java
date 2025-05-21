package ch17.sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // 1
        OptionalDouble optional = list.stream().mapToInt(Integer::intValue).average();
        if (optional.isPresent()) System.out.println("ver1_avg: " + optional.getAsDouble());
        else System.out.println("ver1_avg: 0.0");

        // 2
        double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("ver2_avg: " + avg);

        // 3
        list.stream().mapToInt(Integer::intValue).average().ifPresent(a -> System.out.println("ver3_avg: " + a));
    }
}
