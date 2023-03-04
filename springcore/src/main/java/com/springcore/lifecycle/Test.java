package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		context.registerShutdownHook();
		
		/*
		 * Bean b = (Bean) context.getBean("b1"); System.out.println(b);
		 * 
		 * System.out.println("+++++++++++++++++++++++++++++++++++++++++++"); Pepsi p1 =
		 * (Pepsi) context.getBean("p1"); System.out.println(p1);
		 */
example Exam= (example) context.getBean("example");
System.out.println(Exam);
	}

}
