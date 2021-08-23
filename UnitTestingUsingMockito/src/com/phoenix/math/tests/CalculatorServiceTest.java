package com.phoenix.math.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.phoenix.math.Calculator;
import com.phoenix.math.services.CalculatorService;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorServiceTest {

	@Mock
	private CalculatorService calciService;
	
	
	@InjectMocks
	private Calculator calculator;
	
	
	@Before
	public void initService() {
		// Creating Mock Object of Calculator Service
		// calciService = Mockito.mock(CalculatorService.class);
		// calciService = Mockito.spy(CalculatorService.class);
		
		// Creating Partial Mock - Wrapper Over Real Object of CalculatorService 
		// calciService = Mockito.spy(new CalculatorService(new Calculator()));
		
	}
	
	@Test
	public void testAddition() {
		
		// Creating Mock Behavior of Mock Object
		Mockito.when(calciService.addition(100, 200)).thenReturn(50);
		
		// Creating spy Behavior on real method
		// Mockito.when(calciService.addition(100, 200)).thenCallRealMethod();
		
		assertEquals(50, calciService.addition(100, 200));
		
	}
	
	
	@After
	public void clean() {
		calciService = null;
	}

}
