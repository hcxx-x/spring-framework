package com.xx.spring.service.impl;

import com.xx.spring.service.I;
import org.springframework.stereotype.Service;

/**
 * @auther: hanyangyang
 * @date: 2023/1/6
 */
@Service
public class Z implements I {
	public Z() {
		System.out.println("z的构造方法被调用");
	}
}
