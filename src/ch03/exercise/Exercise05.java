package ch03.exercise;

public class Exercise05 {
    public static void main(String[] args) {
        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        double area = (double) ((lengthTop + lengthBottom) * height / 2); // 이건 안되고.
        double area2 = (double) ((lengthTop + lengthBottom) * height) / 2; // 이건 됨
        double area3 = (double) (lengthTop + lengthBottom) * height / 2;
        double area4 = (lengthTop + lengthBottom) * height / 2.0;
        double area5 = (lengthTop + lengthBottom) * height * 1.0 / 2;

        System.out.println(area);
        System.out.println(area2);
        System.out.println(area3);
        System.out.println(area4);
        System.out.println(area5);
    }
}
