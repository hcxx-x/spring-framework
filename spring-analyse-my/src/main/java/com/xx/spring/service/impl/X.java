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
	//@Autowired
	Y y;

	//@Autowired
	Z z;

	public X() {
		System.out.println("X create  无参构造方法");
	}

	public X(Y y) {
		System.out.println("一个参数的构造方法 x");
		this.y = y;
	}

	public X(Z z) {
		System.out.println("一个参数的构造方法 z");
		this.z = z;
	}

	public X(Y y, Z z) {
		System.out.println("两个参数的构造方法 y z");
		this.y = y;
		this.z = z;
	}



	public void getY(){
		System.out.println(y);
	}


	public void setY(Y y) {
		this.y = y;
	}

	public Z getZ() {
		return z;
	}

	public void setZ(Z z) {
		this.z = z;
	}

	public void printField(){
		System.out.println("field y:"+this.y + " field z:"+this.z);
	}
}
