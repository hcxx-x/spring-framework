package com.xx.spring;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @auther: hanyangyang
 * @date: 2023/1/5
 */
@Configurable
@ComponentScan("com.xx.spring")
//@ImportResource("classpath:spring.xml")
public class AppConfig {

}
