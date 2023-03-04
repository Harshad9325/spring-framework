package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
   ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
 persion p=  (persion) context.getBean("persion");
 System.out.println(p);
 
Adition  add= (Adition) context.getBean("add");
add.doSum1();
	}

}
