package ch08.exercise.p03;

import javax.swing.text.Segment;

public class App01 {
    public static void main(String[] args) {
        CharSequence[] arr = new CharSequence[100];
        arr[0] = "java";
        arr[1] = (CharSequence) new StringBuffer("");
        arr[2] = new StringBuilder("");
        arr[3] = new Segment();


        System.out.println("프로그램 종료");
    }
}