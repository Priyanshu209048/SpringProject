package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*The work which we are doing with xml also can be done with annotation. Simply we declare bean using Component annotation */
/*@Component*/ /*This can be used when we want that spring automatically create the name of the object using the name of class name*/
@Component("obj") /* Here I simply give the name of the object */
@Scope("prototype") /* Here prototype create different object of the class also while giving the object name in @Component */
public class Student {
	/*
	 * Value annotation implicitly give value to the varibles because we did not
	 * give the value to config file due to use of stereotype annotation
	 */
	@Value("Priyanshu Baral")
	private String studentName;
	
	@Value("Delhi")
	private String city;
	
	@Value("#{skill}") /* Here we give the id of stanalone list */
	private List<String> skills;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", skills=" + skills + "]";
	}
	
}
