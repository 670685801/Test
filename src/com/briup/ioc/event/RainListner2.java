package com.briup.ioc.event;

import org.springframework.context.ApplicationListener;

public class RainListner2 implements ApplicationListener<RainEvent>{

	@Override
	public void onApplicationEvent(RainEvent event) {
		System.out.println("我们：" + event.getSource() + "太好了不用上课了！");	
	}

}
