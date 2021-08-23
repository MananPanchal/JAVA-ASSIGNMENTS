/*
 * 	Author : manan.panchal@stltech.in
 * 	Version : 1.0	
 * 	Creation Time : 22th July, 2021
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.services;

import com.phoenix.math.Calculator;

public class CalculatorService {
	
	private Calculator calculator;
	
	public CalculatorService() {
		// TODO Auto-generated constructor stub
	}

	public CalculatorService(Calculator calculator) {
		super();
		this.calculator = calculator;
	}

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	// Business Logic Method
	public int addition(int x, int y) {
		return calculator.add(x, y);
	}
	
}
