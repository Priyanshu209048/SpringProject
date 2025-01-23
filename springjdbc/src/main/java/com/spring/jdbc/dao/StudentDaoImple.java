package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;

@Component("studentDao")
public class StudentDaoImple implements StudentDao {
	
	//We can also set Autowired annotation in this property or also in setter method
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int insert(Student student) {
		//insert query
		String query = "insert into student(id, name, city) values(?,?,?)";
		int result = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return result;
	}

	public int change(Student student) {
		//update query
		String query = "update student set name=?, city=? where id=?";
		int result = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return result;
	}

	public int delete(int studentId) {
		//delete query
		String query = "delete from student where id=?";
		int result = this.jdbcTemplate.update(query, studentId);
		return result;
	}

	public Student getStudent(int studentId) {
		//selecting or fetching single student data
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImple();
		Student result = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return result ;
	}

	public List<Student> getAllStudents() {
		//Selecting or fetching multiple student data
		String query = "select * from student";
		List<Student> result = this.jdbcTemplate.query(query, new RowMapperImple());
		return result;
	}

}
