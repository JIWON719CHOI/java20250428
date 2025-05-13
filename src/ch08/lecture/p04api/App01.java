package ch08.lecture.p04api;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class App01 {
    public static void main(String[] args) {
        String a = "java";
        Object b = a;
        Serializable c = a;
        CharSequence d = a;
        Comparable e = a;
        Constable f = a;
        ConstantDesc g = a;

        System.out.println(g instanceof String);
        System.out.println(g instanceof Object);
        System.out.println(g instanceof Serializable);
        System.out.println(g instanceof CharSequence);
        System.out.println(g instanceof Comparable);
        System.out.println(g instanceof Constable);
        System.out.println(g instanceof ConstantDesc);
    }
}
