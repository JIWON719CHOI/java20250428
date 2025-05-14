package ch16.lecture.p01lambda;

public class App07 {
    public static void main(String[] args) {
        MyInterface07 a = new MyInterface07() {
            @Override
            public int method() {
                // 코드에 꼭 리턴타입에 맞는 return 문을 만나도록 작성
                if (true) {
                    return 3;
                }
                return 5;
            }
        };

        MyInterface07 b = () -> {
            // 코드에 꼭 리턴타입에 맞는 return 문을 만나도록 작성
            if (true) {
                return 3;
            }
            return 5;
        };

        // body 에 리턴문 하나만 있을 때 {} 생략가능, return 생략해야함
        MyInterface07 c = () -> {

            return 5;
        };

        // body 에 리턴문 하나만 있을 때 {} 생략가능, return 생략해야함
        MyInterface07 d = () -> 5;
    }
}

@FunctionalInterface
interface MyInterface07 {
    int method();
}