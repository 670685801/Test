package com.briup.bean;

import java.util.Map;

public class TheacherAsStu {
    private int id;
    private String name;
    private Map<String, Student> students;
	
    public TheacherAsStu() {
		super();
	}
	public TheacherAsStu(Map<String, Student> students) {
		super();
		this.students = students;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Student> getStudents() {
		return students;
	}
	public void setStudents(Map<String, Student> students) {
		this.students = students;
	}
    
    
    
}
