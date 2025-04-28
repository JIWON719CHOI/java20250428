package ch02.lecture;

public class C07Character {
    public static void main(String[] args) {
        // char : 문자형(character) 하나의 문자를 저장하는 자료형 2bytes 16bits

        // 문자 literal : 작은 따옴표로 표시
        char a;
        a = 'a';
        System.out.println("a = " + a);
        a = 'b';
        a = 'B';
//        a = '한글'; 두 글자 이상 안돼용 '' 빈 문자열은 안되지만 '(띄어쓰기)'는 돼용
        a = ' ';
        System.out.println("a = " + a);
//        a = '\u1F633';이거 ㄴ왜? 이건 16진법 이 아니야
        System.out.println("\uD83D\uDE33");

    }
}
