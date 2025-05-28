package etc.lecture.p04annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class App03 {
    @MyAnnotation03
    private int val;

    @MyAnnotation03
    App03() {

    }

    @MyAnnotation03
    public void method(@MyAnnotation03 int param) {
        @MyAnnotation03
        int value;
    }
}

@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation03 {

}