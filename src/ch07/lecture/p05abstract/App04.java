package ch07.lecture.p05abstract;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;

public class App04 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        AbstractList b = a;
        AbstractCollection c = a;
        Object d = a;

        System.out.println(a instanceof ArrayList); // true
        System.out.println(a instanceof AbstractList); // true
        System.out.println(a instanceof AbstractCollection); // true
        System.out.println(a instanceof Object); // true

        System.out.println(b instanceof ArrayList); // true
        System.out.println(b instanceof AbstractList); // true
        System.out.println(b instanceof AbstractCollection); // true
        System.out.println(b instanceof Object); // true

        System.out.println(c instanceof ArrayList); // true
        System.out.println(c instanceof AbstractList); // true
        System.out.println(c instanceof AbstractCollection); // true
        System.out.println(c instanceof Object); // true

        System.out.println(d instanceof ArrayList); // true
        System.out.println(d instanceof AbstractList); // true
        System.out.println(d instanceof AbstractCollection); // true
        System.out.println(d instanceof Object); // true
    }
}