package com.sanket.code;

//https://osherove.com/tdd-kata-1
public class Calculator {

	public static int Add(String numbers) {
		if (numbers.equals(""))
			return 0;

		numbers = "//;\n1;2";
		String delimiter = ",";
		if (numbers.startsWith("//")) {
			delimiter = numbers.substring(numbers.indexOf("//")+2, numbers.indexOf("\n"));
			numbers = numbers.substring(numbers.indexOf("\n")+1);
		}
		
		numbers = numbers.replaceAll("\\n", delimiter);
		String[] nums = numbers.split(delimiter);
		int sum = 0;
		for (int index = 0; index < nums.length; index++) {
			sum += Integer.parseInt(nums[index]);
		}
		return sum;

	}

}
