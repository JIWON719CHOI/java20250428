package ch04.lecture;

public class C16For {
    public static void main(String[] args) {
        int i = 0; // for문 종료 이후에도 사용할 때
        for (i = 0; i < 3; i++) {
            System.out.println(i);
        }
        System.out.println(i);
    }
}
