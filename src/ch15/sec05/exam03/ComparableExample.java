package ch15.sec05.exam03;

import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        // TreeSet Collection
        TreeSet<Person> treeSet = new TreeSet<Person>();

        // Object save
        treeSet.add(new Person("HONG", 45));
        treeSet.add(new Person("KIM", 25));
        treeSet.add(new Person("Park", 33));

        // 객체를 하나씩 가져오기
        for (Person person : treeSet) System.out.println(person.name + ":" + person.age);
    }
}
