package ch06.lecture.p06static;

public class App04 {
    public static void main(String[] args) {
        // main method : 애플리케이션 시작 시 처음 실행되는 메소드

        // 애플리케이션 코드... 실행

        System.out.println("start!");
        System.out.println(args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[i] = " + args[i]);
        }

        if (args.length > 0) {
            String mode = args[0];
            switch (mode) {
                case "dev" -> {
                    System.out.println("dev code start!");
                }
                case "prod" -> {
                    System.out.println("prod code start!");
                }
                case "test" -> {
                    System.out.println("test code start!");
                }
                default -> System.out.println("please add option.");
            }
        }
    }
}
