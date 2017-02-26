package com;

class LinkedList {

	private int out_ins_var = 1;
	private static int out_sta_var = 2;

	private static class Node {

		public void ins() {
			// System.out.println(out_ins_var);
			System.out.println(out_sta_var);
		}

	}

	public void outMethod() {
		Node node = new Node();
		node.ins();
	}

}

public class Inner_Class_Demo {

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();
		linkedList.outMethod();

		// class Local{
		//
		// }

		// -------------------------------------
		
		R r=new R();
		Thread thread=new Thread(r);
		
		Thread thread2=new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
	}

}

class R implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}