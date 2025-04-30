package ch04.lecture;

public class C08SwitchExpression {
    public static void main(String[] args) {
        int a = 2;

        switch (a) {
            case 1:
                System.out.println("code!");
                System.out.println("code@");
                break;
            case 2:
                System.out.println("code#");
                System.out.println("code$");
                break;
            default:
                System.out.println("code%");
                System.out.println("code^");
        }

        // switch Expression
        switch (a) {
            case 1 -> {
                System.out.println("code!");
                System.out.println("code@");
            }
            case 2 -> {
                System.out.println("code#");
                System.out.println("code$");
            }
            default -> {
                System.out.println("code%");
                System.out.println("code^");
            }
        }

        // new style
        switch (a) {
            case 1, 2 -> System.out.println("code1");
            case 3, 4 -> System.out.println("code2");
            default -> System.out.println("code3");
        }
    }
}
