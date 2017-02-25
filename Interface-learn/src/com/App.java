package com;

import com.car.Car;
import com.wheel.CEATWheel;
import com.wheel.MRFWheel;

public class App {

	public static void main(String[] args) {

		Car car = new Car();
		car.setWheel(new CEATWheel());

		car.move();

	}

}
