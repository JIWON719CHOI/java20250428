package ch01.lecture;

public class C02Print {
    public static void main(String[] args) {
        // 출력
        System.out.println("출력+" +
                "메세지");

        // sout : System.out.println
        System.out.println("sout 은 단축어");

        // shift enter : 다음줄에 작성
        System.out.println("shift + enter");

        // 그냥 print는 끝에 다음 줄 없음
        System.out.print("해헿 엔터가 없다");
        System.out.print("해헿");

        // \n : 다음 줄(enter)
        System.out.println('\n');
        System.out.println("헤이헤이~");

        // printf : 특정 위치에 값 포함 출력
        System.out.printf("hello");
        System.out.printf("hello2");
        // %숫자s : 숫자만큼 자리차지
        System.out.printf("%5s%6s\n", "a", "b");
        System.out.printf("12364564987454984546468\n");

        // 숫자만큼 자리 차지

        System.out.printf("%-5s%-2s\n", "23", "12");
        // %d : 정수형 출력


    }
}
