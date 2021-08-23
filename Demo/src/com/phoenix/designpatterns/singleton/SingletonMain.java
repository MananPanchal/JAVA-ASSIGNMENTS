/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 16th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.designpatterns.singleton;

public class SingletonMain {

	public static void main(String[] args) {
		
		System.out.println("Sun : ");
		Sun s1 = Sun.getInstance();
		s1.giveLight();
		
		System.out.println();
		
		System.out.println("Earth : ");
		Earth e1 = Earth.getInstance();
		e1.createLife();
			
		System.out.println();
		
		System.out.println("PrimeMinister : ");
		PrimeMinister pm1 = PrimeMinister.getInstance();		
		pm1.serveNation();
		
		System.out.println();
		
		System.out.println("President : ");
		President p1 = President.getInstance();
		p1.representNation();

	}

}
