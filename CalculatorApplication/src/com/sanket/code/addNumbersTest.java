package com.sanket.code;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class addNumbersTest {

	@Test
	public void test() {
//		Integer output = Calculator.Add("");
//		assertEquals(0, output);
//
//		Integer output1 = Calculator.Add("1");
//		assertEquals(1, output1);
//
//		String input = "" + Integer.MAX_VALUE;
//		Integer outputMaxValue = Calculator.Add(input);
//		assertEquals(Integer.MAX_VALUE, outputMaxValue);
//
//		String inputMin = "" + Integer.MIN_VALUE;
//		Integer outputMinValue = Calculator.Add(inputMin);
//		assertEquals(Integer.MIN_VALUE, outputMinValue);
//
//		Integer outputOfTwoInputs = Calculator.Add("1,2");
//		assertEquals(3, outputOfTwoInputs);
//
//		Integer outPutOfUnknownAmountOfNumbers = Calculator.Add("1,2,3,4,2,5,3,4");
//		assertEquals(24, outPutOfUnknownAmountOfNumbers);

		Integer outputOfSlashN = Calculator.Add("1\n2,3");
		assertEquals(6, outputOfSlashN);

	}

}
