package ch02.sec09;

public class StringConcatExample {
    public static void main(String[] args) {
        // 숫자 연산
        int result1 = 10 + 2 + 8;
        System.out.println("result1 = " + result1);

        // 결합 연산
        String result2 = 10 + 2 + "8"; //앞에 숫자 인식하고 뒤에 스트링.
        System.out.println("result2 = " + result2);

        String result3 = 10 + "2" + 8; //중간에 스트링 있어서 끼어서.. 뒤에 8이 연결연산으로 걍 스트링 됨.
        System.out.println("result3 = " + result3);

        String result4 = "10" + 2 + 8; //앞에가 스트링이면 뒤에도 스트링 되나봄.
        System.out.println("result4 = " + result4);

        String result5 = "10" + (2 + 8); // 이건 괄호로 묶여서 .. 먼저숫자인식함
        System.out.println("result5 = " + result5);


    }
}
