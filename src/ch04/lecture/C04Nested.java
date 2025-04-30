package ch04.lecture;

public class C04Nested {
    public static void main(String[] args) {

        if (false) {
            if (false) {
                System.out.println("코드1");
            } else {
                System.out.println("코드2");
            }
        } else {
            if (false) {
                System.out.println("코드3");
            } else {
                System.out.println("코드4");
            }
        }
    }
}