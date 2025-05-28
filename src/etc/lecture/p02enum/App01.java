package etc.lecture.p02enum;

public class App01 {
    public static void main(String[] args) {
        var var1 = Values.TIGER;
        var var2 = Values.EAGLE;

        Animal v3 = Animal.LION;
        Animal v4 = Animal.EAGLE;
        var v5 = Animal.BULL;

        System.out.println("v3 = " + v3);
        System.out.println("v4 = " + v4);
        System.out.println("v5 = " + v5);

    }
}

// enum 없이
class Values {
    public static final int TIGER = 1;
    public static final int LION = 2;
    public static final int EAGLE = 3;
    public static final int BULL = 4;
}

// enum : 값들을 나열한 타입
enum Animal {
    TIGER, LION, EAGLE, BULL;
}
