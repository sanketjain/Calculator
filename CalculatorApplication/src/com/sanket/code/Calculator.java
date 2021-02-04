package com.sanket.code;

public class Calculator {

	public static int Add(String numbers) {
		if (numbers.equals(""))
			return 0;

		numbers = numbers.replaceAll("\\n", ",");
		String[] nums = numbers.split(",");
		int sum = 0;
		for (int index = 0; index < nums.length; index++) {
			sum += Integer.parseInt(nums[index]);
		}
		return sum;

	}

}
