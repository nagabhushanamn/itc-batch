package com;

class A {

	static String message = "bye";

	static {
		message = "Good bye to all";
	}

	static void sayBye() {
		System.out.println(message);
	}
}

public class Ques {

	static {
		System.out.println("im before main..");
	}

	public static void main(String[] args) {

		A.sayBye();

	}

}
