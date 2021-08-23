/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 16th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.vehicles.cars;

import com.phoenix.interfaces.Movable;
import com.phoenix.vehicles.Vehicle;

public class Car extends Vehicle  implements Movable, Runnable{

	@Override
	public void run() {
		System.out.println("Car Runs");			
	}

	@Override
	public void move() {
		System.out.println("Car Moves");		
	}
	
	@Override
	public void start() {		
		System.out.println("Car Starts");		
	}
	
	@Override
	public void stop() {
		System.out.println("Car Stops");		
	}

}
