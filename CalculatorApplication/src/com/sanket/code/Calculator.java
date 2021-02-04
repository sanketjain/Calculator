package com.sanket.code;

public class Calculator {

	public static int Add(String numbers) {
		if (numbers.equals(""))
			return 0;
		return Integer.parseInt(numbers);
	}

}
