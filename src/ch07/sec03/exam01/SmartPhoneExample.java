package ch07.sec03.exam01;

import ch07.sec02.SmartPhone;

public class SmartPhoneExample {
    public static void main(String[] args) {
        //SmartPhone 객체 생성
        SmartPhone myPhone = new SmartPhone("galaxy", "silver");

        // Phone 으로 부터 상속받은 필드 읽기
        System.out.println("model: " + myPhone.model);
        System.out.println("color: " + myPhone.color);

    }
}
