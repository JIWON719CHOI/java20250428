package leetCode.jiwon;

import java.util.ArrayList;
import java.util.List;

public class p412FizzBuzzShortVer {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String s = ""; // 임시 문자열로 Fizz/Buzz를 조합함
            if (i % 3 == 0) s += "Fizz";
            if (i % 5 == 0) s += "Buzz"; // += 연산을 이용해서 "Fizz"와 "Buzz"가 자동으로 이어짐
            if (s.isEmpty()) s = String.valueOf(i); // 아무것도 안 붙었으면 숫자 그대로 사용
            result.add(s);
        }

        return result;
    }
}
