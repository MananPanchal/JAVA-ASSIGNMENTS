/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 16th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.machines;

import com.phoenix.interfaces.Movable;

public class Robot implements Movable{
	
	public void processData() {
		System.out.println("Robot is processing data");		
	}

	public void senseInfo() {
		System.out.println("Robot is sensing information");		
	}
	
	public void useArtificialIntelligence() {
		System.out.println("Robot is using Artificial Intelligence");		
	}
	
	@Override
	public void move() {
		System.out.println("Robot moves");		
	}

}
