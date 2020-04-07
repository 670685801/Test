package com.briup.bean;

public class Person {

	private  int  pno;
	private  String  name;
	private  boolean  gender;
	private  int  age;
	private  Address  address;
	public int getpno() {
		return pno;
	}
	public void setpno(int pno) {
		this.pno = pno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [pno=" + pno + ", name=" + name + ", gender=" + gender + ", age=" + age + ", address=" + address
				+ "]";
	}

	
}
