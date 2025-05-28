package etc.lecture.p04annotation;

public class App01 {
    public static void main(String[] args) {

    }
}

@FunctionalInterface
interface MyInterface {
    void method();
}

class Book {
    // annotation
    @Override
    public String toString() {
        return super.toString();
    }
}
// annotation : 코드의 부가 정보
// 어디선가(like... spring framework) 이 부가 정보를 보고 어떤 행동을 취하라고 알려줌


