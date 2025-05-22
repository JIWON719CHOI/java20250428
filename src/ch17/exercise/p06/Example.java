package ch17.exercise.p06;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(new Member("HONG", 30), new Member("SHIN", 40), new Member("GAM", 26));

        // 고전적 for
        double sum = 0;
        for (Member member : list) {
            sum += member.getAge();
        }
        double avg = sum / list.size();
        System.out.println("avg = " + avg);

        // 참조 타입 stream
        Integer sum2 = list.stream().map(Member::getAge).reduce(0, Integer::sum);
        Double avg2 = sum2.doubleValue() / list.size();
        System.out.println("avg2 = " + avg2);
    }
}
