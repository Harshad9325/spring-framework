package com.spring.orm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entities.Student;

public class StudentDAO {
	
	private HibernateTemplate hibernateTemplate;
	
	//insert student
	@Transactional
	public int insert (Student student) {
		
		Integer i=(Integer) this.hibernateTemplate.save(student);
		return i;
		
	}
	
	//get the singal data
	public Student  getStudent(int Id) {
		Student student = this.hibernateTemplate.get(Student.class,Id);
		return student;
	}
	
	//get all student(all rows)
	public List<Student> getAllStudent(){
		List<Student> student = this.hibernateTemplate.loadAll(Student.class);
		return student;
	}
	//delete the data
	@Transactional
        public void delete(int Id) {
        	Student student = this.hibernateTemplate.get(Student.class, Id);
        	this.hibernateTemplate.delete(student);
        }
        
        //update data
	@Transactional
        public void updateStudent(Student student) {
        	this.hibernateTemplate.update(student);
        }
	
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	

}
