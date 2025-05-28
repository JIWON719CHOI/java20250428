package etc.lecture.p01var;

import java.util.ArrayList;
import java.util.List;

public class App01 {
    public static void main(String[] args) {
        int a;
        a = 3;
        int b = 5;

        // var = 변수의 타입이 추론 가능할 때
        var c = 2;
        var d = 'a';
        var e = "🩷";
//        var f; // 값이 없어서 추론 못해서 오류

        List<Integer> list = List.of(9, 1, 2);
        var list1 = List.of(1, 5, 7); //이것 됨...

        ArrayList<String> list2 = new ArrayList<>();
        var list3 = new ArrayList<>();

    }
}
