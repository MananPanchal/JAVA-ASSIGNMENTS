/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 16th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.planets;

public class Jupiter extends Planet{

	@Override
	public void move() {
		System.out.println("Jupiter Moves");			
	}

	@Override
	public void rotate() {
		System.out.println("Jupiter Rotates");		
	}

	@Override
	public void revolve() {
		System.out.println("Jupiter Revolves");		
	}

	@Override
	public boolean supportsLife() {
		return false;
	}
	
	

}
