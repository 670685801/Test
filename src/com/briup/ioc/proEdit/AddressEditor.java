package com.briup.ioc.proEdit;


import java.beans.PropertyEditorSupport;

public class AddressEditor extends PropertyEditorSupport {
	
	@Override
	public String getAsText() {
		return super.getAsText();
	}
	
	//Spring遇到数据类型不一致并且不能自己处理的时候会调用这个方法处理字符串
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] str = text.split(",");
		String city = str[0];
		String street = str[1];
		String country = str[2];
		Address add = new Address(city, street, country);
		setValue(add);
	}

}

