package com.webcalculator.webcalculator.webCalculator;

/**
 * Класс ActionImpl
 */
public class ActionImpl implements Action {

	int a, b, c;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	public int addition(int a, int b) {
		c = a + b;
		return c;
	}

	public int subtraction(int a, int b) {
		c = a - b;
		return c;
	}

	public int division(int a, int b) {
		c = a / b;
		return c;
	}

	public int multiplication(int a, int b) {
		c = a * b;
		return c;
	}

	@Override
	public String toString() {
		return "ActionImpl{" +
			"a=" + a +
			", b=" + b +
			", c=" + c +
			'}';
	}
}