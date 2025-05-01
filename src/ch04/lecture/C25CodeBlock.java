package ch04.lecture;

public class C25CodeBlock {
    public static void main(String[] args) {
        if (true) {
            // 코드블럭 {} 내의 코드들은 오른쪽 들여쓰기 해야함. 꼭!
        } else if (true)
            // 코드 블럭 내의 코드가 한 줄이면 {} 생략 가능
            // 하지만 생략하지 말것!
            System.out.println();
        else
            System.out.println();
        System.out.println();

        for (int i = 0; i < 0; i++)
            System.out.println();

        boolean a = true;
        while (a)
            break;

    }
}
