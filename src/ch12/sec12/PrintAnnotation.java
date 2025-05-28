package ch12.sec12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 적용 대상: METHOD // 유지 정책: RUNTIME
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

public @interface PrintAnnotation {
    // value 속성: 선의 종류 // number 속성: 출력 횟수
    String value() default "-";

    int number() default 15;
}
