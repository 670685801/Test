package com.briup.ioc.annotation;

import org.springframework.stereotype.Component;
//Component如果不起名字，
//表示将来在Spring容器中这个bean对象得名字是这个bean对象的首字母进行小写
@Component
public class Office {
	private String num = "001";
	
	public Office(){
		
	}
	
	public Office(String num) {
		this.num = num;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
	
}
