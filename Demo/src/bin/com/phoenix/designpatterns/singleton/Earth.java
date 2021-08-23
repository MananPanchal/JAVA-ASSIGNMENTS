/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 16th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.designpatterns.singleton;

public class Earth {
	
	private static Earth earth_instance = null;
	
	private Earth() {
		System.out.println("In Earth Constructor");		
	}
	
	public static Earth getInstance() {
		
		if(earth_instance == null)
			earth_instance = new Earth();
		
		return earth_instance;
		
	}
	
	void createLife() {
		
		System.out.println("Earth creates Life.");
		
	}

}
