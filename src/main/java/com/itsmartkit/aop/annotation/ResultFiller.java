package com.itsmartkit.aop.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * TODO 结果封装注解
 * @author cyj
 * @description //TODO 
 * @date 2019/9/3 
 * @param  
 * @return 
 * change notes
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ResultFiller {
}
