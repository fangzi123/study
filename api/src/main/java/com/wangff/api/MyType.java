package com.wangff.api;

import java.lang.annotation.*;

/**
 * @author wangff
 * @desc TODO
 * @createTime 2020年12月12日 12:01:00
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyType {
        String value() default "";
}
