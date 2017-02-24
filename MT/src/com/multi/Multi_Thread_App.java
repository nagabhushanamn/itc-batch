package com.multi;

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

class Task1 implements Runnable {
	public void doTask1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.nextLine();
		System.out.println("Hello " + name);
		sc.close();
	}
	@Override
	public void run() {
		this.doTask1();
	}
}

class Task2 implements Runnable {
	public void doTask2() {
		for (int i = 0; i < 100; i++) {
			System.out.printf("count - %d \n", i);
		}
	}
	@Override
	public void run() {
		this.doTask2();
	}
}

public class Multi_Thread_App {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName() + " start");

		Task1 task1=new Task1();
		Task2 task2=new Task2();
		
		Thread thread1=new Thread(task1,"A");
		Thread thread2=new Thread(task2,"B");
		
		thread1.start();
		thread2.start();

		System.out.println("continue with other work...");

	}

}
