package com.springcore.javaConfig;

import org.springframework.stereotype.Component;

//@Component
public class Student {
	
	private Sleeping sleeping;

	public Student(Sleeping sleeping) {
		super();
		this.sleeping = sleeping;
	}

	public Sleeping getSleeping() {
		return sleeping;
	}

	public void setSleeping(Sleeping sleeping) {
		this.sleeping = sleeping;
	}

	public void study() {
		this.sleeping.time();
		System.out.println("Student is reading books");
	}
}
