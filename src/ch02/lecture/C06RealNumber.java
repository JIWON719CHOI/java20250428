package ch02.lecture;

public class C06RealNumber {
    public static void main(String[] args) {
        // 실수 :
        // float : 4bytes, 16bits
        float a = 3.14f;
        System.out.println("a = " + a);
        // double : 8bytes, 64bits 더 넓은 범위를 표현해서 왠만하면 이거 씀.
        double b = 1.7976931348623157E+308;
        System.out.println("b = " + b);
        // java 코드에서 실수 literal은 double로 인식
        // java 에서 실수 literal이 float로 표현하려면 끝에 F(f)
    }
}
