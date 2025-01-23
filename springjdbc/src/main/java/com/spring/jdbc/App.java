package com.spring.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Program started...");
        
		
//		 System.out.println("Enter id: "); 
//		 int id = sc.nextInt();
//		 System.out.println("Enter name: "); 
//		 String name = sc.next();
//		 System.out.println("Enter city: "); 
//		 String city = sc.next();
		 
        // spring jdbc -> Jdbc Template
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(jdbcConfig.class);
        //JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");
        
        //Insert Query
        //String query = "insert into student(id, name, city) values(?,?,?)";
        
        //Fire Query
        //int result = template.update(query, 2, "Rohan", "Delhi");
        //int result = template.update(query, id, name, city);
        
        //System.out.println("Number of record inserted : " + result);
        
        System.out.println("--------------------------");
        
        //Insert operation
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        Student student = new Student();
//        student.setId(3);
//        student.setName("Sohan");
//        student.setCity("Bihar");
//        
//        int result = studentDao.insert(student);
//        System.out.println("Student Added: " + result);
        
        System.out.println("--------------------------");
        
        //Update operation
        student.setId(3);
        student.setName("Mohan");
        student.setCity("UP");
        
        int result = studentDao.change(student);
        System.out.println("Data changed: " + result);
        
        System.out.println("--------------------------");
        
        //Delete operation
//        int result = studentDao.delete(4);
//        System.out.println("Data Deleted: " + result);
        
        System.out.println("---------------------------");
        
        //selecting or fetching single student data
//        Student student = studentDao.getStudent(1);
//        System.out.println(student);
        
        System.out.println("---------------------------");
        
        //selecting or fetching multiple student data
        List<Student> student1 = studentDao.getAllStudents();
        //System.out.println(student);
        //Or
        for (Student student2 : student1) {
			System.out.println(student2);
		}
        
    }
}
