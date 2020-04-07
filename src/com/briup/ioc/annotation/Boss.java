package com.briup.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Boss {
	private String name;
	@Autowired
	private Car car;
	@Autowired
	private Office office;
	
	
	public Boss() {
		super();
	}
	public Boss(String name, Car car, Office office) {
		super();
		this.name = name;
		this.car = car;
		this.office = office;
	}
	public Boss(Car car, Office office) {
		super();
		this.car = car;
		this.office = office;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Office getOffice() {
		return office;
	}
	public void setOffice(Office office) {
		this.office = office;
	}
	
	public void init(){
		System.out.println("初始化");
	}
	
	public void destory(){
		System.out.println("销毁");
	}
	
	

}
