package com.ncs.beans;

public class Student {
	private String name;
	private int rollNo;
	private Address address;

	
	public Student(String name, int rollNo, Address address) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.address = address;
	}


	public void display() {
		System.out.println("RollNo: "+rollNo);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
	}
}
