package com.emp;

public class Employee {
	
	private int id;
	public String name;
	public double salary;

	public Employee(int id) {
		if(id!=0){
			this.id=0;
		}
	}
	
	public int getId(){
		return this.id;
	}
	
}