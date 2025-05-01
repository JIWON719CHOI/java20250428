package ch04.practice;

public class C03NestedFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++)
            System.out.println("⭐".repeat(i)); // java11 부터 가능

        System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖➖➖");

        for (int i = 5; i > 0; i--) {
            System.out.println("💗".repeat(i));
        }

        System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖➖➖");

        for (int i = 0; i <= 5; i++) {
            System.out.println("🤍".repeat(5 - i) + "🖤".repeat(i));
        }

        System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖➖➖");
        for (int i = 1; i <= 5; i++)
            System.out.println(" ".repeat(5 - i) + "🟥".repeat(i));

        System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖➖➖");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖➖➖");

        for (int i = 0; i < 5; i++) System.out.println("01234".substring(0, i + 1));
        // substring(0, i + 1) : 매 줄마다 앞에서부터 i+1 개 문자만 잘라 출력

        System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖➖➖");
        // 이중 for문 없이 한 줄로 표현하고 싶다면 Java 11부터 지원되는
        // repeat()와 StringBuilder를 써서 이렇게도 할 수 있어요:
        for (int i = 0; i < 5; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j <= i; j++) {
                sb.append(j);
            }
            System.out.println(sb);
        }

        System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖➖➖");

        
    }
}
