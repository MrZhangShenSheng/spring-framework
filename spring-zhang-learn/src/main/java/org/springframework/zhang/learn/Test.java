package org.springframework.zhang.learn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ss_zhang
 * @version 1.0
 * @description: TODO
 * @date 2022/7/6 20:39
 */
public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Object user = context.getBean("user");
		System.err.println(user );
		context.close();
	}
}
