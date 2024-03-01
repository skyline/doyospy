package com.doyospy.core.annotation;

import java.lang.annotation.*;

/**
 * Rest接口响应注解
 * @author  Robin
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface RestResponse {
}
