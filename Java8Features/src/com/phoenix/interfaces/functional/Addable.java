/*
 * 	Author : manan.panchal@stltech.in
 * 	Version : 1.0
 * 	Creation Time : 15th July,2021
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.interfaces.functional;

@FunctionalInterface
public interface Addable {
	
	double add(double a, double b);
	
	default float addFloats(float a, float b) {
		return a+b;
	}
	
	static void show() {
		System.out.println("show of Addable.");
	}
	

}
