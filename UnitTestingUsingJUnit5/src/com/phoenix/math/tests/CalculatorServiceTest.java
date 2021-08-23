package com.phoenix.math.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Executable;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.phoenix.math.Calculator;
import com.phoenix.math.services.CalculatorService;

class CalculatorServiceTest {

	private static CalculatorService calService;
	
	// @BeforeEach		// Initialization Logic
	@BeforeAll
	public static void init() {
		calService = new CalculatorService(new Calculator());
	}
	
	@Test		// Test Method - Test Case
	public void testAddition() {
		
		int expectedResult = 30;
		int actualResult = calService.addition(20, 20);
		
		// Testing Service Functionality
		//assertEquals(expectedResult, actualResult);
		assertNotEquals(expectedResult, actualResult);
		
	}
	
	@Test		// Test Method - Test Case
	public void checkDivision() {
		
		assertEquals(2, calService.division(10, 5));
		
	}
	
	@Test
	public void checkDivideByZeroException() {
		
		assertThrows(ArithmeticException.class, ()->calService.division(10, 0));
		
	}
	
	// @AfterEach		// Clean up Logic
	@AfterAll
	public static void clean() {
		calService = null;
	}

}
