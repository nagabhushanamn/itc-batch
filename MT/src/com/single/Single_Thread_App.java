package com.single;

import java.util.Scanner;

/*
 *  java-appl ==> one process
 *  
 *  tasks
 *  
 *  --> get name from user and greet him/her
 *  --> print num b/w 1-100
 * 
 */

class Task1 {
	public void doTask1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.nextLine();
		System.out.println("Hello " + name);
		sc.close();
	}
}

class Task2 {
	public void doTask2() {
		for (int i = 0; i < 100; i++) {
			System.out.printf("count - %d \n", i);
		}
	}
}

public class Single_Thread_App {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName() + " start");

		// step-1
		Task1 task1 = new Task1();
		task1.doTask1();

		// step-2
		Task2 task2 = new Task2();
		task2.doTask2();

		System.out.println("continue with other work...");

	}

}
