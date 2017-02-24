package com;

/*
 *   1. non-sattic inner class
 *   2. static inner-class
 *   3. local inner class
 *   4. anonymous inner class
 * 
 * 
 */

class Outer {

	private static int sta = 1;
	private int ins = 1;

	private class Inner1 {
		void m() {
			System.out.println(sta);
			System.out.println(ins);
		}
	}

	public static class Inner2 {
		void m() {
			System.out.println(sta);
			// System.out.println(ins);
		}
	}
	
	public void outerM() {
		Inner1 inner1=new Inner1();
		inner1.m();
	}

}

class R implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}

public class Inner_Class_Ex {

	public static void main(String[] args) {

		Outer.Inner2 oi=new Outer.Inner2();
		
		class LocalInner{
			
		}
		
		//-------------------------------------
		
		R r=new R();
		
		//-------------------------------------
		
		Runnable r2=new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		};
		
		Thread thread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});

	}

}
