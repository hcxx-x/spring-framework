package com.xx.spring.test;

import com.xx.spring.AppConfig;
import com.xx.spring.service.impl.X;
import com.xx.spring.service.impl.Y;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther: hanyangyang
 * @date: 2023/1/5
 */
public class MyTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		ac.getBean(X.class).printField();
	}
}
