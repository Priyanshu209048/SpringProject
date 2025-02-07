package com.springcore.auto_wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	/* Annotation checks with byType */
	@Qualifier("address1") /* We use Qualifier to tell which bean we provide it */
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Setting Value");
		this.address = address;
	}
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "emp [address=" + address + "]";
	}
	
}
