package lesson09_interface_ex;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface UserAnnon {
//	String value(); // 기본값 없음 (사용할때 꼭 지정해줘야 된다.)
//	String value() default ""; // 기본값 주는 방법
	String[] value() default ""; // 배열은 어노테이션에서만 사용 가능한 문법이다.
	int number() default 5;
	
}
