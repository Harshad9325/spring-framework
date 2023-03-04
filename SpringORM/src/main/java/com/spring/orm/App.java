package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDAO;
import com.spring.orm.entities.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
		StudentDAO studentDAO = context.getBean("studentDAO", StudentDAO.class);
//	Student student=new Student(12,"harshad","pune");
//	int r=studentDAO.insert(student);
//	System.out.println(r);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go = true;
		while (go) {
			System.out.println("press 1 for add new student");
			System.out.println("press 2 for display all student");
			System.out.println("press 3 for get details of one student");
			System.out.println("press 4 for delete student");
			System.out.println("press 5 update student");
			System.out.println("press 6 exit");

			try {
				int input = Integer.parseInt(br.readLine());

				switch (input) {
				case 1:
					// add new student
					// tacking the input from user
					System.out.println("Enter student Id:");
					int uId = Integer.parseInt(br.readLine());

					System.out.println("Enter  student name:");
					String uName = br.readLine();

					System.out.println("Enter your city:");
					String uCity = br.readLine();

					// creating object
					Student s = new Student();

					// setting values
					s.setId(uId);
					s.setName(uName);
					s.setCity(uCity);
					// saving student object to database by calling insert of student dao
					int r = studentDAO.insert(s);
					System.out.println(r + "student added  ");
					System.out.println("**********************************************************");
					System.out.println();
					break;

				case 2:
					// display all student
					System.out.println("************************************************************ ");
					List<Student> allStudent = studentDAO.getAllStudent();

					for (Student st : allStudent) {
						System.out.println("Name : " + st.getName());
						System.out.println("Id : " + st.getId());
						System.out.println("city : " + st.getCity());
						System.out.println("______________________________________");
					}

					break;

				case 3:
					// get details of one student
					System.out.println("Enter student Id:");
					int userId = Integer.parseInt(br.readLine());
					Student student = studentDAO.getStudent(userId);
					System.out.println("Name : " + student.getName());
					System.out.println("Id : " + student.getId());
					System.out.println("city : " + student.getCity());
					System.out.println("______________________________________");

					break;

				case 4:
					// delete student
					System.out.println("Enter student Id:");
					int Id = Integer.parseInt(br.readLine());
					studentDAO.delete(Id);
					System.out.println("Student deleted succusfully..........");
					break;

				case 5:
					// update student
					System.out.println("Enter student Id:");
					int Id1 = Integer.parseInt(br.readLine());
					Student student2 = studentDAO.getStudent(Id1);

					System.out.println("Enter  student name:");
					String Name = br.readLine();

					System.out.println("Enter your city:");
					String City = br.readLine();

					// setting values
					student2.setName(Name);
					student2.setCity(City);
					studentDAO.updateStudent(student2);
					System.out.println("done.............");
					break;

				case 6:
					// exit
					go = false;
					break;

				}

			} catch (Exception e) {
				System.out.println("invalide input try with another one!!!");
				System.out.println(e.getMessage());
			}

		}
		System.out.println("Thank you for using my application");
		System.out.println("See you soon........!!!!!!!!");
	}
}
