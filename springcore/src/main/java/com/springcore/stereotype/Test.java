package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student stud=con.getBean("ob",Student.class);
		/*
		 * System.out.println(stud); System.out.println(stud.getAddress());
		 * System.out.println(stud.getAddress().getClass().getName());
		 */
		
		System.out.println(stud.hashCode());
		
		Student stud1=con.getBean("ob",Student.class);
		System.out.println(stud1.hashCode());
	}

}
