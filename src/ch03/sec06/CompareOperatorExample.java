package ch03.sec06;

public class CompareOperatorExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        boolean result1 = (num1 == num2);
        boolean result2 = (num1 != num2);
        boolean result3 = (num1 <= num2);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        char char1 = 'A';
        char char2 = 'b';
        boolean result4 = (char1 < char2); // 65 < 66
        System.out.println(result4);

        int num3 = 1;
        double num4 = 1.0;
        boolean result5 = (num3 == num4);
        System.out.println(result5);

        float num5 = 0.1f;
        double num6 = 1.0;
        boolean result6 = (num5 == num6);
        boolean result7 = (num5 == (float) num6);
        System.out.println(result6);
        System.out.println(result7);

        String str1 = "자바";
        String str2 = "java";
        boolean result8 = (str1.equals((str2)));
        boolean result9 = (!str1.equals((str2)));
        System.out.println(result8);
        System.out.println(result9);
    }
}
