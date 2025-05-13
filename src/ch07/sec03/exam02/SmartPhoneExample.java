package ch07.sec03.exam02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        // SmartPhone 객체 생성
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        // Phone 으로 부터 상속받은 필드 읽기
        System.out.println("model: " + myPhone.getModel());
        System.out.println("color: " + myPhone.getColor());
    }
}
