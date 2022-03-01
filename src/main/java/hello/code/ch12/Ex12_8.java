package hello.code.ch12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
@SuppressWarnings("1111")
@TestInfo(testBy = "aaa", testDate = @DateTime(yymmdd = "160101", hhlmmss = "235959"))
public class Ex12_8 {
    public static void main(String[] args) {
        Class<Ex12_8> cls = Ex12_8.class;

        TestInfo anno = cls.getAnnotation(TestInfo.class);
        System.out.println("anno.testedBy()=" + anno.testBy());
        System.out.println("anno.testDate().yymmdd()=" + anno.testDate().yymmdd());
        System.out.println("anno.testDate().hhmmss()=" + anno.testDate().hhlmmss());

        for (String str : anno.testTools()) {
            System.out.println("testTools="+ str);
        }

        System.out.println();

        Annotation[] annotations = cls.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo {
    int count() default  1;
    String testBy();

    String[] testTools() default "JUnit";

    TestType testType() default TestType.FIRST;
    DateTime testDate();
}

@Retention(RetentionPolicy.RUNTIME)
@interface DateTime {
    String yymmdd();
    String hhlmmss();
}

enum TestType {
    FIRST, FINAL
}
