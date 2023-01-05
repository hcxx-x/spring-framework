package com.xx.spring;

import com.xx.spring.service.impl.X;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @auther: hanyangyang
 * @date: 2023/1/5
 */
@Configurable
@ComponentScan("com.xx.spring")
public class AppConfig {

}
