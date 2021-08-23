/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 16th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.designpatterns.singleton;

public class PrimeMinister {
	
	private static PrimeMinister primeMinister_instance = null;
	
	private PrimeMinister() {
		System.out.println("In PrimeMinister Constructor");		
	}
	
	public static PrimeMinister getInstance() {
		
		if(primeMinister_instance == null)
			primeMinister_instance = new PrimeMinister();
		
		return primeMinister_instance;
		
	}
	
	void serveNation() {
		
		System.out.println("Prime Minister serves Nation.");
		
	}

}
