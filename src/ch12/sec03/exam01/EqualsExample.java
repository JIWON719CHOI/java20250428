package ch12.sec03.exam01;

import ch16.sec05.exam03.Member;

public class EqualsExample {
    public static void main(String[] args) {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        if (obj1.equals(obj2)) {
            //매개값이 Member 타입이고 id도 동일하므로 true
            System.out.println("obj1 == obj2");
        } else {
            System.out.println("obj1 != obj2");
        }

        if (obj1.equals(obj3)) {
            // 매개값이 Member 타입이지만 id가 다르므로 false
            System.out.println("obj1 == obj3");
        } else {
            System.out.println("obj1 != obj3");
        }
    }
}
