package com.company.customeannotation;
import java.lang.annotation.*;


@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Cource1
{
    String cid() default "c-111";
    String cname() default "C Programming lang";
    int ccost() default 10000;
}

