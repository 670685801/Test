package com.briup.jtest;

import java.sql.Connection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.briup.bean.Student;
import com.briup.bean.Teacher;
import com.briup.bean.TheacherAsStu;
import com.briup.ioc.annotation.Boss;
import com.briup.ioc.event.RainEvent;
import com.briup.ioc.life.Life;
import com.briup.ioc.life.LifeBean;

//ioc功能的测试类
//每个方法测试一个知识点
//每个知识点对应src下面的一个package
//每个package中是这个知识点的配置方式

//这里面的方法名字和对应的src下面的package名字是对应的
//这个类中从上到下 方法的顺序就是我们学习ioc知识点的顺序
@SuppressWarnings("all")
public class IocTest {
	

	//本类中的测试方法中的代码大致的编写模式
	public void ioc_test() {

		try {
			//1 声明要读取的xml文件路径(如果有多个可以放在数组中)
			//2 读取xml文件创建spring的容器contanier
			//3 从容器container中根据配置的名字拿出需要使用的对象
			//4 使用对象进行操作(对象中的需要的各种数据和依赖的其他对象早已经被spring的容器注入进来)
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 知识点:spring的set方式注入
	@Test
	public void ioc_set() {

		try {
			String[] path = {"com/briup/ioc/set/set.xml"};
			ApplicationContext container = 
					new ClassPathXmlApplicationContext(path);
			
			/*Student s1 = (Student)container.getBean("stu");
			System.out.println(s1);
			Student s2 = (Student)container.getBean("stu");
			System.out.println(s2);
			Student s3 = (Student)container.getBean("stu");
			System.out.println(s3);*/
			/*System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getAge());*/
			
			/*Student ypf = (Student)container.getBean("ypf");
			System.out.println(ypf);
			System.out.println(ypf.getId());
			System.out.println(ypf.getName());
			System.out.println(ypf.getAge());
			System.out.println("--------------");
			Teacher lc = (Teacher)container.getBean("lc");
			System.out.println(lc);
			System.out.println(lc.getId());
			System.out.println(lc.getName());
			System.out.println(lc.getStudent());*/
			
			/*System.out.println(container.getBean("ypf"));
			System.out.println(container.getBean("ch"));
			System.out.println("-------");
			
			Teacher lc = (Teacher)container.getBean("lc");
			System.out.println(lc);
			System.out.println(lc.getId());
			System.out.println(lc.getName());
			//System.out.println(lc.getStudent());
*/			
			
			//System.out.println(container.getBean("s6"));
			System.out.println(container.getBean("s5"));

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 知识点:向一个对象中注入集合
	@Test
	public void ioc_collection() {
		try {
			String[] path = {"com/briup/ioc/collection/collection.xml"};
			ApplicationContext container = 
					new ClassPathXmlApplicationContext(path);
			
			Student student = (Student)container.getBean("stu");
			student.show();
			System.out.println(student.getList().getClass());
			System.out.println(student.getMap().getClass());
			System.out.println(student.getSet().getClass());
			System.out.println(student.getProp().getClass());
			
			/*TheacherAsStu lc =(TheacherAsStu) container.getBean("lc");
			System.out.println(lc.getStudents());*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//知识点:构造器注入(之前的是set注入)
	@Test
	public void ioc_constructor() {
		try {
			String path = "com/briup/ioc/constructor/constructor.xml";
			
			ApplicationContext container = 
						new ClassPathXmlApplicationContext(path);
			Student student = (Student)container.getBean("s2");
			System.out.println(student);
			System.out.println(student.getAge());
			System.out.println(student.getName());
			System.out.println(student.getId());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//知识点:自动注入
	@Test
	public void ioc_autowired() {
		try {
			String path = "com/briup/ioc/autowired/autowired.xml";
			ApplicationContext container = 
					new ClassPathXmlApplicationContext(path);
			Teacher teacher =(Teacher) container.getBean("t2");
			System.out.println(teacher);
			System.out.println(teacher.getId());
			System.out.println(teacher.getName());
			System.out.println(teacher.getStudent());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//知识点:配置文件中的标签 bean和bean之间也是可以继承的
	@Test
	public void ioc_extend() {
		try {
			String[] path = {"com/briup/ioc/extend/extends.xml"};
			ApplicationContext container = 
						new ClassPathXmlApplicationContext(path);
			
			Teacher teacher = (Teacher)container.getBean("ky");
			System.out.println(teacher);
			System.out.println(teacher.getId());
            System.out.println(teacher.getName());
            System.out.println(teacher.getStudent());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	//知识点:spring所管理对象的声明周期
	@Test
	public void ioc_life() {
		try {
			String path = "com/briup/ioc/life/life.xml";
			ClassPathXmlApplicationContext container = 
					new ClassPathXmlApplicationContext(path);
			LifeBean b1= (LifeBean)container.getBean("life");
			LifeBean b2= (LifeBean)container.getBean("life");
			container.destroy();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//知识点:一个xml配置文件中 导入另外一个xml配置文件
	@Test
	public void ioc_imp() {
		try {
			
			//String[] path = {"com/briup/ioc/imp/teacher.xml","com/briup/ioc/imp/student.xml"};
			String[] path = {"com/briup/ioc/imp/import.xml"};
			ApplicationContext container = 
					new ClassPathXmlApplicationContext(path);
            Teacher teacher =(Teacher) container.getBean("t");
            System.out.println(teacher.getStudent());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//知识点: 在xml中配置工厂类，然后通过这个工厂类获得工厂生产的实例
	@Test
	public void ioc_Factory() {
		try {
			String path = "com/briup/ioc/factory/factory.xml";
			ApplicationContext container = 
					new ClassPathXmlApplicationContext(path);
			Connection connection =(Connection) container.getBean("conn");
			System.out.println(connection);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//知识点: 实例工厂
	@Test
	public void ioc_instanceFactory() {
		try {
			String path = "com/briup/ioc/instanceFactory/instanceFactory.xml";
			ApplicationContext container = 
					new ClassPathXmlApplicationContext(path);
			Connection connection =(Connection) container.getBean("conn");
			System.out.println(connection);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//知识点: 静态工厂
	@Test
	public void ioc_staticFactory() {
		try {
			String path = "com/briup/ioc/staticFactory/staticFactory.xml";
			ApplicationContext container = 
					new ClassPathXmlApplicationContext(path);
			Connection connection =(Connection) container.getBean("conn");
			System.out.println(connection);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	//知识点: 使用自定义属性编辑器
	public void ioc_proEdit() {
		try {
			String[] path = {"com/briup/ioc/proEdit/proEdit.xml"};
			ApplicationContext container = 
					new ClassPathXmlApplicationContext(path);
			com.briup.ioc.proEdit.Student student =(com.briup.ioc.proEdit.Student) container.getBean("stu");
			System.out.println(student);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	//知识点: 自定义事件
	public void ioc_event() {
		try {
			String path = "com/briup/ioc/event/event.xml";
			ApplicationContext container = 
					new ClassPathXmlApplicationContext(path);
			
			//容器发布事件
			container.publishEvent(new RainEvent("下雨啦"));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	//知识点: ioc中的注解
	public void ioc_annotation() {
		try {
			String path = "com/briup/ioc/annotation/annotation.xml";
			ApplicationContext container = 
					new ClassPathXmlApplicationContext(path);
			Boss boss =(Boss) container.getBean("boss");
			System.out.println(boss);
			Boss boss2 =(Boss) container.getBean("boss");
			System.out.println(boss2);
			//System.out.println(boss.getName());
			System.out.println(boss.getCar());
			System.out.println(boss.getOffice());
			//System.out.println(boss.getCar().getName());
			//System.out.println(boss.getCar().getPrice());
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
