package ch03.exercise;

public class Exercise03 {
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30;

        // 학생 한 명이 가지는 연필 수
        int pencilsPerStudents = pencils / students; // / <- 이게 나누기 연산자임.
        System.out.println(pencilsPerStudents);

        // 남은 연필 수
        int pencilsLeft = pencils - (pencilsPerStudents * students); //이건 내가 한거고
        int pencilsLeft2 = pencils % students; // 이건 % 나머지 연산자 쓴거.
        System.out.println(pencilsLeft);
        System.out.println(pencilsLeft2);
    }
}
