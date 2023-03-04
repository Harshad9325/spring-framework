package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entites.Student;
@Component("studentDao")
public class StudentDaoImpl implements StudentDao{

	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		  // insert query
        String q="insert into student(id,name,city) values(?,?,?)";
        int r = this.jdbcTemplate.update(q,student.getId(),student.getName(),student.getCity());
		return r;
	}
	public int change(Student student) {
//update data
		String q="update student set name=? , city=? where id=?";
		int res = this.jdbcTemplate.update(q,student.getName(),student.getCity(),student.getId());
		return res;
	}
	//delete student
	public int delete(Student student) {
		String q="delete from student where id=? ";
		int r = this.jdbcTemplate.update(q,student.getId());
		return r;
	}
	//select singal student data
	public Student getStudent(int studentId) {
		String q="select * from student where id=?";
	RowMapper<Student > rowMapper=	new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(q, rowMapper,studentId);
		return student ;
	}
	// selecting multiple student data
	public List<Student> getAllStudent() {
		String q="Select * from student";
		List<Student> students = this.jdbcTemplate.query(q,new RowMapperImpl());
		return students;  		
	}
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int insert(StudentDao studentDao) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	

}
