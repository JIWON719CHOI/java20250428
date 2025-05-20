package ch15.sec03.exam02;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // hashCode 재정의 name과 age 값이 같으면 동일한 hashCode가 리턴됨.
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    // equals 재정의 name 과 age 값이 같으면 true가 리턴됨
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member target) {
            return target.name.equals(name) && (target.age == age);
        } else {
            return false;
        }
    }
}
