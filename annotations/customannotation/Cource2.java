//Example for method level annotation
package com.company.customeannotation;
import java.lang.annotation.*;


@Inherited
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Cource2
{
    String cid() default "c-111";
    String cname() default "C Programming lang";
    int ccost() default 10000;
}

