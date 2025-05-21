package leetCode.jiwon;

import java.util.ArrayList;
import java.util.List;

public class p412FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(); // 결과를 담을 빈 리스트 생성

        for (int i = 1; i <= n; i++) { // 1부터 n까지 반복
            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i)); // 숫자를 문자열로 바꿔서 추가
            }
        }
        return answer;
    }


}
