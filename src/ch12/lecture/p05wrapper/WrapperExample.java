package ch12.lecture.p05wrapper;

public class WrapperExample {
    public static void main(String[] args) {
        // 기본형 → 포장 클래스 (명시적 박싱)
        Byte byteObj = Byte.valueOf((byte) 1);
        Short shortObj = Short.valueOf((short) 2);
        Integer intObj = Integer.valueOf(100);
        Long longObj = Long.valueOf(1000L);
        Float floatObj = Float.valueOf(3.14f);
        Double doubleObj = Double.valueOf(3.1415);
        Character charObj = Character.valueOf('A');
        Boolean boolObj = Boolean.valueOf(true);

        // 포장 클래스 → 기본형 (명시적 언박싱)
        byte b = byteObj.byteValue();
        short s = shortObj.shortValue();
        int i = intObj.intValue();
        long l = longObj.longValue();
        float f = floatObj.floatValue();
        double d = doubleObj.doubleValue();
        char c = charObj.charValue();
        boolean bool = boolObj.booleanValue();

        // 오토박싱 (자동 변환: 기본형 → 포장 클래스)
        Integer autoBoxedInt = 123;
        Double autoBoxedDouble = 45.67;
        Boolean autoBoxedBool = false;

        // 언박싱 (자동 변환: 포장 클래스 → 기본형)
        int unboxedInt = autoBoxedInt;
        double unboxedDouble = autoBoxedDouble;
        boolean unboxedBool = autoBoxedBool;

        // 포장 클래스의 유용한 메서드
        int parsedInt = Integer.parseInt("200");   // 문자열 → 정수
        double parsedDouble = Double.parseDouble("3.1415");
        boolean parsedBoolean = Boolean.parseBoolean("true");

        String intToStr = Integer.toString(300);   // 정수 → 문자열
        String boolToStr = Boolean.toString(false);

        // 출력 확인
        System.out.println("포장 객체들: " + byteObj + ", " + shortObj + ", " + intObj + ", " + longObj);
        System.out.println("           " + floatObj + ", " + doubleObj + ", " + charObj + ", " + boolObj);
        System.out.println("언박싱한 값: " + b + ", " + s + ", " + i + ", " + l + ", " + f + ", " + d + ", " + c + ", " + bool);
        System.out.println("오토박싱 & 언박싱: " + unboxedInt + ", " + unboxedDouble + ", " + unboxedBool);
        System.out.println("문자열 파싱: " + parsedInt + ", " + parsedDouble + ", " + parsedBoolean);
        System.out.println("숫자/불린 → 문자열: " + intToStr + ", " + boolToStr);
    }
}
