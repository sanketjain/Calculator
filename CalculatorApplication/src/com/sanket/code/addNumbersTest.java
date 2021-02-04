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
	}

}
