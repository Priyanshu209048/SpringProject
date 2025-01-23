package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entities.Student;

/*A Data Access Object class can provide access to a particular data resource without coupling the resource's API to the business logic */
public interface StudentDao {
	public int insert(Student student);

	public int change(Student student);

	public int delete(int studentId);

	public Student getStudent(int studentId);	//This is used to select of fetch single id
	
	public List<Student> getAllStudents();	//This is used to select of fetch multiple id
}
