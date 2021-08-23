/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 16th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.designpatterns.singleton;

public class Sun {
	
	private static Sun sun_instance = null;
	
	private Sun() {
		System.out.println("In Sun Constructor");		
	}
	
	public static Sun getInstance() {
		
		if(sun_instance == null)
			sun_instance = new Sun();
		
		return sun_instance;
		
	}

	void giveLight() {
		
		System.out.println("Sun gives light.");
		
	}
	
}
