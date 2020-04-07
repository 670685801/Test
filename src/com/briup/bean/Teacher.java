package com.briup.bean;

import java.util.Map;

public class Teacher {
	private long id;
	private String name;
	private Student student;
	
	
	public Teacher() {}
	
	
	public Teacher(Student student) {
		super();
		this.student = student;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}






	
	
	//byName方式: 方法名:setStudent ---> property名字:student
	//byType方式:
	
}
