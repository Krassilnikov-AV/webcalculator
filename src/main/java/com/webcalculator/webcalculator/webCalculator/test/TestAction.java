package com.webcalculator.webcalculator.webCalculator.test;

import com.webcalculator.webcalculator.webCalculator.ActionImpl;

/**
 * Класс TestAction
 */
public class TestAction {

	//	получить сложение 2-х чисел
	ActionImpl action = new ActionImpl();

	int getAddition(int a, int b) {
		return action.addition(a, b);
	}

	int getSubtraction(int a, int b) {
		return action.subtraction(a, b);
	}

	int getDivision(int a, int b) {
		return action.division(a, b);
	}
	int multiplication(int a, int b){
		return action.multiplication(a, b);
	}

}