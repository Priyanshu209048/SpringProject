package com.springcore.constructorInjection;

public class Addition {
	private int a;
	private int b;
	
	Addition(double a, double b){
		super();
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constructor : double, double");
	}
	
	Addition(int a, int b){
		super();
		this.a = a;
		this.b = b;
		System.out.println("Constructor : int, int");
	}
	
	/*
	 * If we dont't write the string constructor then it will print the first
	 * constructor if we don,t give the type argument int config file
	 */	
	Addition(String a, String b){
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor : String, String");
	}
	
	public void doSum() {
		System.out.println("Value of a is " + this.a);
		System.out.println("Value of b is " + this.b);
		System.out.println("Sum is = " + (this.a + this.b));
	}
}
