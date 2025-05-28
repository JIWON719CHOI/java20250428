package etc.lecture.p04annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

public class App05 {
    public static void main(String[] args) {
        Class<Car> c = Car.class;
        Field[] fields = c.getDeclaredFields();
        MyAnnotation5 a0 = fields[0].getAnnotation(MyAnnotation5.class);
        MyAnnotation5 a1 = fields[1].getAnnotation(MyAnnotation5.class);

        String v0 = a0.value();
        String v1 = a1.value();

        System.out.println("v0 = " + v0);
        System.out.println("v1 = " + v1);
    }
}

class Car {
    @MyAnnotation5("tesla")
    private String name;
    @MyAnnotation5("Samsung")
    private int price;
}

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation5 {
    String value() default "";
}
