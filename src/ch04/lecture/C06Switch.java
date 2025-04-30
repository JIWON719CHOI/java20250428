package ch04.lecture;

public class C06Switch {
    public static void main(String[] args) {
        // switch : 특정 변수의 값이 같은 부분부터 실행

        switch (50) {
            case 10:
                System.out.println("A");
            case 20:
                System.out.println("B");
            case 30:
                System.out.println("C");

            default:
                // 일치하는 case 가 없을 때
                System.out.println("Z");
                break;
        }
    }
}
