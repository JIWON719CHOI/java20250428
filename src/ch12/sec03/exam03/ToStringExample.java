package ch12.sec03.exam03;

public class ToStringExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("SAMSUNG", "ANDROID");

        String strObj = myPhone.toString(); // toString() 메소드 호출
        System.out.println(strObj);

        System.out.println(myPhone); // toString() 메소드 호출
    }
}
