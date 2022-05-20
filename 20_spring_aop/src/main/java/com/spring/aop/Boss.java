package com.spring.aop;

import org.springframework.stereotype.Component;

//테스트 목적의 클래스2
@Component
public class Boss {
	
	
	void work() {
		System.out.println("사장의 일을 한다.");
	}
	
	public void getWorkingTime() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
