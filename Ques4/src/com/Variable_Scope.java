package com;

/*
 *  3 types of variables based on scope
 *  
 *   1. local
 *   2. instance
 *   3. static
 * 
 */

class Person {

	static int count; // instance variable	
	
	String name;
//	int count; // instance variable

	public void sayHello() {
		// int count=0; // Local variable
		count++;
		System.out.println(this.name + " Hello.." + count);
	}
}

public class Variable_Scope {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.name = "Nag";

		Person person2 = new Person();
		person2.name = "Ria";

		person1.sayHello();
		person2.sayHello();
		person2.sayHello();

	}

}
