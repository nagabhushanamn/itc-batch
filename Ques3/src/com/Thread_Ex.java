package com;

class R implements Runnable {
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " running...");

		for (int i = 1; i < 5; i++) {
			System.out.println(name + "-->" + i);
			try {
				Thread.sleep(10 * 1000);
			} catch (InterruptedException e) {
				System.out.println("go away... i hate u");
			}
			
		}

	}
}

public class Thread_Ex {

	public static void main(String[] args) {

		R r = new R();
		Thread thread1 = new Thread(r, "preethi");
		// thread1.run();
		thread1.start(); // new stack...

		Thread thread2 = new Thread(r);
		thread2.setName("tania");
		// thread2.run();
		thread2.start();

		// System.out.println(Thread.currentThread().getId());
		//
		// System.out.println(thread1.getId());
		// System.out.println(thread2.getId());

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		thread1.interrupt();
		thread2.interrupt();

	}

}
