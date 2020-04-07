package com.briup.ioc.event;

import org.springframework.context.ApplicationListener;

public class RainListner1 implements ApplicationListener<RainEvent>{

	@Override
	public void onApplicationEvent(RainEvent event) {
		// TODO Auto-generated method stub
		System.out.println("唐僧大喊：" + event.getSource() + "赶快收衣服喽！");
	}

}
