package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("my first program...............!");

		ApplicationContext context = new AnnotationConfigApplicationContext(JDBCConfig.class);

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		// INSERT
		/*
		 * Student student=new Student(); student.setId(7); student.setName("jon");
		 * student.setCity("lacknow");
		 * 
		 * int result = studentDao.insert(student);
		 * System.out.println("student added..........."+result);
		 */

		// UPDATE

		/*
		 * Student student = new Student(); student.setId(6); student.setName("sham");
		 * student.setCity("dhelhi"); int result = studentDao.change(student);
		 * System.out.println("data changed succsessul......" + result);
		 */
		// DELETE
		/*
		 * Student student =new Student(); student.setId(1); int
		 * result=studentDao.delete(student);
		 * System.out.println("data deleteded.........."+result);
		 */

		/*
		 * Student student = studentDao.getStudent(5); System.out.println(student);
		 */

		// select all student data
		 	
		  List<Student> students = studentDao.getAllStudent();
		  
		  for(Student s : students) { System.out.println(s); }
		 

	}

}
