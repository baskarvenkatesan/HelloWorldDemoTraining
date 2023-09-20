package com.test.training.Calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsCalculatorTest {

	//Method for testing addition
	@Test
	public void addTest() {
		JenkinsCalculator calc = new JenkinsCalculator();
		assertEquals(15,calc.addNumbers(10, 5));
	}

	//Method for testing subtraction
	
	@Test
	public void subTest() {
		JenkinsCalculator calc = new JenkinsCalculator();
		assertEquals(5,calc.subNumbers(10, 5));
	}
}
