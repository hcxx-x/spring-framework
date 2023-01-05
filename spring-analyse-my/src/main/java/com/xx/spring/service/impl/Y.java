package com.xx.spring.service.impl;

import com.xx.spring.service.I;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @auther: hanyangyang
 * @date: 2023/1/5
 */
public class Y implements I {

	public Y() {
		System.out.println("Y create");
	}

	@Autowired
	I x;
}
