package com;

/*
 * 
 *     MRF
 * 
 * 
 */

interface Wheel {
	void rotate();

	void commonMethod();
}

abstract class MRWheel implements Wheel {
	@Override
	public void commonMethod() {
		// TODO Auto-generated method stub

	}
}

class TwoWheelerWheel extends MRWheel {

	@Override
	public void rotate() {
		// TODO Auto-generated method stub

	}

}

class FourWheelerWheel extends MRWheel {

	@Override
	public void rotate() {
		// TODO Auto-generated method stub

	}

}

public class Demo {
	public static void main(String[] args) {

	}
}
