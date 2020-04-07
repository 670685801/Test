package com.briup.theory.ioc;

public class IOCTest {
	public static void main(String[] args) {
		
		//创建对象，建立对象与对象之间的关系
		//程序员自己做的，怎么做的
		/*Student stu = new Student();
		Teacher t = new Teacher();
		t.setStudent(stu);
		System.out.println(stu);
		System.out.println(t);
		System.out.println(t.getStudent());*/
		
		
		//创建对象，建立对象与对象之间的关系
		//用IOC容器处理
		//从容器中拿出自己想用的对象就能直接使用
		BeanFactory container = new BeanFactory();
		Teacher teacher =(Teacher) container.getBean("t");
		System.out.println(teacher);
		teacher.getStudent();
		Object student = container.getBean("stu");
		System.out.println(student);
		
		
		
	}
}
