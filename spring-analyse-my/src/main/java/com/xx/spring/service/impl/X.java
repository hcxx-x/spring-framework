package com.xx.spring.service.impl;

import com.xx.spring.service.I;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther: hanyangyang
 * @date: 2023/1/5
 */
@Service
public class X implements I {

	public X() {
		System.out.println("X create");
	}

	@Autowired
	I y;
}
