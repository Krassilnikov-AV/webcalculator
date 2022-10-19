package com.webcalculator.webcalculator.webCalculator;

import java.util.*;

/**
 * Класс Processing
 */
public class Processing {

	ActionImpl action = new ActionImpl();

	//	метод для обработки строки (парсинга)
	String str = null;

	Processing() {
		gettingAstring(str);
	}

	private void gettingAstring(String str) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a string: ");
		str = in.next();
		System.out.printf("Your string: %s \n", str);
		in.close();
	}

	private void processData(String str) {

//		builder.substring(Integer.parseInt(str));

		char[] num = str.toCharArray();

//	пройтись по массиву символов и  определить числа и знак
		for (int i = 0; i < str.length(); i++) {
			String[] s = str.split("+");


//		int c = Integer.parseInt(str);

//		int resalt = 0;
//		System.out.printf("Your resalt: %d \n", resalt);

		}

	}
}