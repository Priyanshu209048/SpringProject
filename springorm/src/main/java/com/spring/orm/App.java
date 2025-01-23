package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        
//        Student student = new Student(1001, "Priyanshu", "Delhi");
//        int result = studentDao.insert(student);
//        System.out.println("Data Inserted : " + result);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("**********Welcome to the Sprinng ORM project**********");
        
        boolean enter = true;
        while (enter) {
        	
        	System.out.println();
        	System.out.println("PRESS 1 for add new student...");
            System.out.println("PRESS 2 for display all the student...");
            System.out.println("PRESS 3 for get the details of one student...");
            System.out.println("PRESS 4 for delete student...");
            System.out.println("PRESS 5 for update student...");
            System.out.println("PRESS 6 for exit...");
            
            try {
				
            	int input = Integer.parseInt(br.readLine());
            	
            	switch (input) {
				case 1:
					//Add a new Student
					//Taking inputs from the user
					System.out.println("Enter the student id : ");
					int uid = Integer.parseInt(br.readLine());
					
					System.out.println("Enter the student name : ");
					String uname = br.readLine();
					
					System.out.println("Enter the student city : ");
					String ucity = br.readLine();
					
					//Setting values in student object
					Student student = new Student();
					student.setStudentId(uid);
					student.setStudentName(uname);
					student.setStudentCity(ucity);
					
					//Saving student object to database by calling insert method
					int result = studentDao.insert(student);
					System.out.println("Student added : " + result);
					System.out.println("*************************************");
					
					break;
					
				case 2:
					//Display all student
					System.out.println("*************************************");
					List<Student> allStudents = studentDao.getAllStudents();
					for (Student student2 : allStudents) {
						System.out.println("ID : " + student2.getStudentId());
						System.out.println("Name : " + student2.getStudentName());
						System.out.println("City : " + student2.getStudentCity());
						System.out.println("-------------------------------------");
						
					}
					System.out.println("*************************************");
					
					break;
					
				case 3:
					//Display or get the Single student data
					System.out.println("*************************************");
					System.out.println("Enter the student id : ");
					int userId = Integer.parseInt(br.readLine());
					Student student2 = studentDao.getStudent(userId);
					System.out.println("ID : " + student2.getStudentId());
					System.out.println("Name : " + student2.getStudentName());
					System.out.println("City : " + student2.getStudentCity());
					System.out.println("-------------------------------------");
					
					break;
					
				case 4:
					//Delete student
					System.out.println("Enter the student id : ");
					int id = Integer.parseInt(br.readLine());
					studentDao.deleteStudent(id);
					System.out.println("Student Deleted...");
					
					break;
					
				case 5:
					//Update the student
					System.out.println("*************************************");
					System.out.println("Enter the student id that need to update : ");
					int uId = Integer.parseInt(br.readLine());
					System.out.println("PRESS 1 to update the name...");
					System.out.println("PRESS 2 to update the city...");
					
					int update = Integer.parseInt(br.readLine());
					
					Student student3 = studentDao.getStudent(uId);
					String uName = student3.getStudentName();
					String uCity = student3.getStudentCity();
					
					switch (update) {
					case 1:
						System.out.println("Enter the updated name of the " + uId+ " id : ");
						uName = br.readLine();
						student3 =  new Student(uId, uName, uCity);
						
						break;
						
					case 2:
						System.out.println("Enter the updated city of the " + uId+ " id : ");
						uCity = br.readLine();
						student3 =  new Student(uId, uName, uCity);
						
						break;

					default:
						break;
					}
					studentDao.updateStudent(student3);
					System.out.println("Student details updated...");
					
					break;
					
				case 6:
					//Exit
					enter = false;
					//or we can use
					//System.exit(0); //But this function can't print the next statement which is outside the while loop
					break;

				default:
					break;
				}
            	
			} catch (Exception e) {
				System.out.println("Invalid input try with another one !!");
				System.out.println(e.getMessage());
			}
            
		}
        
        System.out.println();
        System.out.println("Program Exited");
        System.out.println("Thankyou for using my Application");
      
    }
}
