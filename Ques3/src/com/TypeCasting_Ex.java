package com;

class LT {

}

class Human extends LT {

}

class Animal extends LT {

}

public class TypeCasting_Ex {

	public static void main(String[] args) {

		int[] a = new int[4];
		a[1]=50;
		
		Object o=a;
		
		int[] b=(int[])o;
		b[1]=100;
		
		// int[] c=b;
		// System.out.println(c[1]);
		
		
		char[] cc=(char[])o;

	}

}
