package ch12.lecture.p01object;

public class Person implements Cloneable {
    String name;

    public Person(String name) {
        this.name = name;
    }

    // toString() 오버라이드
    @Override
    public String toString() {
        return "이름: " + name;
    }

    // equals() 오버라이드
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person other) {
            return this.name.equals(other.name);
        }
        return false;
    }

    // hashCode() 오버라이드
    @Override
    public int hashCode() {
        return name.hashCode();
    }

    // clone() 오버라이드
    @Override
    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("복제 실패", e);
        }
    }

    // finalize() (Java 9 이상에서는 비권장)
/*    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " 객체가 정리됩니다.");
        super.finalize();
    }*/

    public static void main(String[] args) {
        Person p1 = new Person("철수");
        Person p2 = new Person("철수");
        Person p3 = p1; // 같은 주소

        // toString()
        System.out.println("p1: " + p1);  // toString() 호출

        // equals()
        System.out.println("p1 equals p2? " + p1.equals(p2)); // true
        System.out.println("p1 == p2? " + (p1 == p2));         // false
        System.out.println("p1 == p3? " + (p1 == p3));         // true

        // hashCode()
        System.out.println("p1 hashCode: " + p1.hashCode());
        System.out.println("p2 hashCode: " + p2.hashCode());

        // getClass()
        System.out.println("p1 클래스: " + p1.getClass().getName());

        // clone()
        Person p4 = p1.clone();
        System.out.println("p4 (복제된 객체): " + p4);
        System.out.println("p1 == p4? " + (p1 == p4));         // false
        System.out.println("p1.equals(p4)? " + p1.equals(p4)); // true

        // finalize()는 직접 호출하지 않음 (가비지 컬렉션 중 자동 호출)
        p1 = null;
        p2 = null;
        p3 = null;
        p4 = null;

        // 가비지 컬렉터 요청 (finalize 작동 가능성 있음)
        System.gc();

        // wait(), notify(), notifyAll()은 Thread와 함께 사용
        Object lock = new Object();

        Thread thread = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("스레드 대기 중...");
                    lock.wait(); // 스레드 대기
                    System.out.println("스레드 깨어남!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();

        try {
            Thread.sleep(1000); // 1초 대기 후
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (lock) {
            lock.notify(); // 스레드 깨움
        }
    }
}