package ch02.lecture;

public class C16String {
    public static void main(String[] args) {
        // 기본타입 <-> String 사이에 형변환 안됨

        int a = 300;
//        String b = a;
        String c = "300";
//        int d = c;

        // 기본타입 -> String
        // String.valueOf() 메소드 사용
        int e = 700;
        String f = String.valueOf(e);

        // String 연결 연산자(+) 사용
        int i = 900;
        String j = i + "";

        // String -> 기본 타입
        // 타입명.parse타입명
        String k = "333";
        String l = "123.456";
        String m = "true";

        int n = Integer.parseInt(k);
        double o = Double.parseDouble(l);
        boolean p = Boolean.parseBoolean(m);

        // String -> 기본타입
        // pasing  실패
        String q = "123.456qwer";
        double r = Double.parseDouble(q); //숫자 형식이 아니라서 qwer 때문에...
        System.out.println("r = " + r);

    }
}
