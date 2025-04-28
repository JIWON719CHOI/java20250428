package ch02.sec01;

public class VariableUseExample {
    public static void main(String[] args) {
        int hour = 3;
        int minute = 5;
        System.out.println(hour + "time" + minute + "minute");

        int totalMinute = (hour * 60) + minute;
        System.out.println("total" + totalMinute + "minute");
    }
}
