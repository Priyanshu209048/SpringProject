package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{22/2}")	//This is expression
	private int x;
	
	@Value("#{63/3}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(81)}")	//Invoke static method
	private double z;
	
	@Value("#{T(java.lang.Math).PI}")	//Invoke Variable
	private double e;
	
	@Value("#{new java.lang.String('Priyanshu Baral')}")	//Create object
	private String name;
	
	//@Value("#{True}")	//Invoke Boolean by default it give false if we don't add this annotation
	@Value("#{10 < 5}")
	private boolean a;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isA() {
		return a;
	}
	public void setA(boolean a) {
		this.a = a;
	}
	public double getE() {
		return e;
	}
	
	public void setE(double e) {
		this.e = e;
	}
	
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", a=" + a + "]";
	}
	
}
