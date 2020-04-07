package com.briup.ioc.set;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.briup.bean.Person;

public class SetterTest {

	
	@Test
	public void setter() {

		try {
			String[] path = {"com/briup/ioc/set/set.xml"};
			ApplicationContext container = new ClassPathXmlApplicationContext(path);
			Person person = container.getBean("person",Person.class);
//			Person person = (Person)container.getBean("person");
			System.out.println(person);
			
			
			//改名測試
			System.out.println("--------------------");
			System.out.println(container.getBean("stu"));
			System.out.println(container.getBean("student1"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
