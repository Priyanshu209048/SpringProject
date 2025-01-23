package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	//CRUD Operations

	//Save student or Create
	@Transactional	//Without this annotation the write operation in database can not be performed it is direct connect with Transactional Manager bean
					//Also Transactional Annotation is used in Write, Update and Delete
	public int insert(Student student) {
		//insert
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}
	
	//Read
	//Get the single data(object)
	public Student getStudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);	//We can also use load method instead of get
		return student;
	}
	
	//Get the multiple data(all rows)
	public List<Student> getAllStudents() {
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
	}
	
	//Update
	//Updating data
	@Transactional
	public void updateStudent(Student student) {
		this.hibernateTemplate.update(student);	//We can also use saveOrUpdate method
	}
	
	//Delete
	//Deleting the data
	@Transactional
	public void deleteStudent(int studentId) {
		//First it get the data then perform the delete operation
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
	}
	
}
