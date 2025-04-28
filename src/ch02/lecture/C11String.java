package ch02.lecture;

public class C11String {
    public static void main(String[] args) {
        String a;
        a = "자바 스크립트는 자바랑 달라";
        System.out.println(a);

        a = "동해물과 백두산이\n" +
                "마르고 닳도록\n" +
                "하느님이 보우하사\n" +
                "우리나라 만세";
        System.out.println(a);
//        여러줄을 작성할 때 유용한... : String block
//        """..."""
//        가장 왼쪽의 들여쓰기 기준
//        첫줄은 항상 다음줄에 작성해야 해..
        a = """
                동해물과 백두산이
                마르고 닳도록
                하느님이 보우하사
                우리나라 만세""";
        System.out.println(a);
    }
}
