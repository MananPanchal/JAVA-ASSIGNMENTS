/*
 * 	@Author manan.panchal@stltech.in
 * 	@Version 1.0
 * 	@Creation Time 21th July, 2021
 * 	@Copyright Sterlite Technologies Ltd.
 */

package com.phoenix.math.services;

import com.phoenix.math.Calculator;

// Service Class
public class CalculatorService {
	
	private Calculator calci;
	
	public CalculatorService() {
		// TODO Auto-generated constructor stub
	}

	public CalculatorService(Calculator calci) {
		super();
		this.calci = calci;
	}
	
	// Application Business Logic Method
	public int addition(int a, int b) {
		return calci.add(a, b);
	}
	
	// Application Business Logic Method
	public int division(int x, int y) {
		return calci.divide(x, y);
	}

}
