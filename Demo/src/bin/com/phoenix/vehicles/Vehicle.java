/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 16th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.vehicles;

public abstract class Vehicle {
	
	protected void start() {		
		System.out.println("Vehicle Starts");		
	}
	
	protected void stop() {
		System.out.println("Vehicle Stops");		
	}
}
