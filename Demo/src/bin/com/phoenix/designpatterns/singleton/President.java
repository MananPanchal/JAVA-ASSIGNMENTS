/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 16th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.designpatterns.singleton;

public class President {
	
	private static President president_instance = null;
	
	private President() {
		System.out.println("In President Constructor");		
	}
	
	public static President getInstance() {
		
		if(president_instance == null)
			president_instance = new President();
		
		return president_instance;
		
	}
	
	void representNation() {
		
		System.out.println("President represents Nation.");
		
	}

}
