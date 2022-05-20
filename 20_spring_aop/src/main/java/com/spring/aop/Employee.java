package com.spring.aop;

import org.springframework.stereotype.Component;

//테스트  목적의 클래스3
@Component
public class Employee {

	void work() {
		System.out.println("직원의 일을 한다..");
	}
	public void getWorkingTime() {
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
