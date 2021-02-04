package com.sanket.code;

import java.util.Arrays;

public class Calculator {

	public static int Add(String numbers) {
		if (numbers.equals(""))
			return 0;

		String[] nums = numbers.split(",");
		int sum = 0;
		int current = 0;
		for (int index = 0; index < nums.length; index++) {
			sum += Integer.parseInt(nums[index]);
		}
		return sum;

	}

}
