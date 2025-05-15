package ch12.lecture.p02system;

import java.util.Arrays;
import java.util.Scanner;

public class SystemDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. System.in - 사용자 입력 받기
        System.out.print("1. 이름을 입력하세요: ");
        String name = scanner.nextLine();

        // 2. System.out - 출력
        System.out.println("2. 안녕하세요, " + name + "!");

        // 3. System.err - 에러 출력
        System.err.println("3. ※ 참고: 에러 메시지는 System.err로 출력됩니다.");

        // 4. 시간 측정 - currentTimeMillis
        long startMillis = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
        } // 약간의 시간 소모
        long endMillis = System.currentTimeMillis();
        System.out.println("4. 걸린 시간(ms): " + (endMillis - startMillis));

        // 5. 시간 측정 - nanoTime
        long startNano = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
        }
        long endNano = System.nanoTime();
        System.out.println("5. 걸린 시간(ns): " + (endNano - startNano));

        // 6. 배열 복사 - arraycopy
        int[] original = {1, 2, 3, 4, 5};
        int[] copied = new int[5];
        System.arraycopy(original, 0, copied, 0, original.length);
        System.out.println("6. 복사된 배열: " + Arrays.toString(copied));

        // 7. 시스템 속성 - getProperty
        System.out.println("7. Java 버전: " + System.getProperty("java.version"));
        System.out.println("8. 운영체제 이름: " + System.getProperty("os.name"));

        // 8. 환경 변수 - getenv
        System.out.println("9. 사용자 이름 환경 변수(USER): " + System.getenv("USER")); // 윈도우는 "USERNAME"

        // 9. 객체 ID 확인 - identityHashCode
        Object obj = new Object();
        System.out.println("10. identityHashCode: " + System.identityHashCode(obj));

        // 10. 가비지 컬렉션 요청
        System.out.println("11. GC 실행 요청");
        System.gc();

        // 11. 프로그램 종료 (주의: 실행되면 아래 코드는 실행 안 됨)
        // System.exit(0);
        System.out.println("12. 이 메시지는 exit() 호출 전에만 출력됩니다.");

        scanner.close();
    }
}