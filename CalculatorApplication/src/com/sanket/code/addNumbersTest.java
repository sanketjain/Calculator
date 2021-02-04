package com.sanket.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class addNumbersTest {

	@Test
	public void test() {
		Integer output = Calculator.Add("");
		assertEquals(0, output);
		
		Integer output1 = Calculator.Add("1");
		assertEquals(1, output1);
		
		String input = "" + Integer.MAX_VALUE;
		Integer outputMaxValue = Calculator.Add(input);
		assertEquals(Integer.MAX_VALUE, outputMaxValue);
		
		String inputMin = "" + Integer.MIN_VALUE;
		Integer outputMinValue = Calculator.Add(inputMin);
		assertEquals(Integer.MIN_VALUE, outputMinValue);
		
		Integer outputOfTwoInputs = Calculator.Add("1,2");
		assertEquals(3, outputOfTwoInputs);
	}

}
