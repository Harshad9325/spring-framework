package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext(" com/springcore/standalone/collection/aloneconfig.xml"); 
persion persion1=context.getBean("persion1",persion.class);
System.out.println(persion1);
System.out.println(persion1.getFriends().getClass().getName());
System.out.println("------------------------------------------------------");
System.out.println(persion1.getFeestructure().getClass().getName());
System.out.println("------------------------------------------------------");
System.out.println(persion1.getProps().getClass().getName());
	}

}
