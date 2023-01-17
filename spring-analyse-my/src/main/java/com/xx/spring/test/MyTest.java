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
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		// 这里可以注册配置类，也可以注册一个普通的bean
		ac.register(AppConfig.class);
		// 刷新容器或者说是初始化容器更合适
		ac.refresh();
		ac.getBean(X.class).printField();
	}
}
