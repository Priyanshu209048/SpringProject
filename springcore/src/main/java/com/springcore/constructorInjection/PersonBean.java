package com.springcore.constructorInjection;

import java.util.List;

public class PersonBean {
	private String name;
	private int personId;
	private Certificate certi;
	private List<String> list;
	
	public PersonBean(String name, int personId, Certificate certi, List<String> list) {
		super();
		this.name = name;
		this.personId = personId;
		this.certi = certi;
		this.list = list;
	}

	@Override
	public String toString() {
		return this.name + " : " + this.personId + "{ " + this.certi.getName() + " }" + this.list;
	}
	
	
}
