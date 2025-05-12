package ch07.lecture.p05abstract;

public class App01 {
    public static void main(String[] args) {
        Chihuahua01 a = new Chihuahua01();
        Wolf01 b = new Wolf01();
        // 추상클래스(abstract class)로 인스턴스 만들 수 없음
//        Canids01 c = new Canids01();

        Canids01 d = a;
        Canids01 e = b;

        Canids01 f = new Chihuahua01();
        Canids01 g = new Wolf01();
    }
}

// @formatter:off
// 개과
abstract class Canids01 { }

// 치와와
class Chihuahua01 extends Canids01 { }

// 늑대
class Wolf01 extends Canids01 { }