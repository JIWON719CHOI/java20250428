package ch15.sec05.exam04;

import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        // 비교자를 제공한 TreeSet Collection 생성
        TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new FruitComparator());

        // Object save
        treeSet.add(new Fruit("🍇", 3000));
        treeSet.add(new Fruit("🍉", 10000));
        treeSet.add(new Fruit("🍓", 6000));

        // 객체를 하나씩 가져오기
        for (Fruit fruit : treeSet) System.out.println(fruit.name + ":" + fruit.price);
    }
}
