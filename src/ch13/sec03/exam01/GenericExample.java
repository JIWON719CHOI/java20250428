package ch13.sec03.exam01;

public class GenericExample {
    // generic method .. type parameter T 정의
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<>();
        box.set(t);
        return box;
    }

    public static void main(String[] args) {
        // generic method 호출
        Box<Integer> box1 = boxing(100); // T 를 Integer로 대체
        int intValue = box1.get();
        System.out.println(intValue);

        // generic method 호출
        Box<String> box2 = boxing("HONG"); // T 를 String 으로 대채
        String strValue = box2.get();
        System.out.println(strValue);
    }
}
