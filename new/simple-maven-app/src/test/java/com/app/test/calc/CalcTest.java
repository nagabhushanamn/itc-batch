package com.app.test.calc;

import org.junit.Assert;
import org.junit.Test;

import com.app.calc.Calc;

public class CalcTest {

	private Calc calc = new Calc();

	@Test
	public void add() {
		int n1 = 12;
		int n2 = 12;
		int expected = 24;
		int actual = calc.add(n1, n2);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void mul() {
		int n1 = 12;
		int n2 = 12;
		int expected = 144;
		int actual = calc.mul(n1, n2);
		Assert.assertEquals(expected, actual);
	}

}