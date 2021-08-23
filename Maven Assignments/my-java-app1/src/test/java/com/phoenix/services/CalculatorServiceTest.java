/*
 * 	Author : manan.panchal@stltech.in
 * 	Version : 1.0	
 * 	Creation Time : 22th July, 2021
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.services;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.phoenix.math.Calculator;

public class CalculatorServiceTest {
	
	private CalculatorService calciService;
	
	@Before
	public void setUp() {
		calciService = new CalculatorService(new Calculator());
	}
	
	@Test
	public void testAddition() {
		
		assertEquals(30, calciService.addition(10, 10));
		
	}
	
	@After
	public void clean() {
		calciService = null;
	}

}
