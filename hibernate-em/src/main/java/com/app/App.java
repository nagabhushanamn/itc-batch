package com.app;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.dao.EmployeeDAO;

public class App {

	public static void main(String[] args) {

		int[] a = { 1 };
		int[] b[] = { { 1 } };
		int[][] c[] = { { { 1 } } };
		int[][][] d[] = { { { { 1 } } } };

		System.out.println(Thread.currentThread().getId());

		Thread thread = new Thread(new Runnable() {

			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getId());
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getId());
			}
		});
		
		Thread thread3 = new Thread(new Runnable() {

			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getId());
			}
		});

		thread.start();
		thread2.start();
		thread3.start();

	}

}
