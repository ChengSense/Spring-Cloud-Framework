package com.cloud.base.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description: 访问令牌
 * @author cdl
 * @version V1.0
 * @Date 2018年11月8日 下午7:20:53
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Access {

	/**
	 * @Description 未定义Access注解的Controller默认拦截所有
	 * @return
	 */
	boolean value() default true;

}
