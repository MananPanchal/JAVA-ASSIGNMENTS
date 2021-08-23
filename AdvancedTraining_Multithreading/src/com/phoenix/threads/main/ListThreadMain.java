/*	Author : manan.panchal@stltech.in
 * 	Version : 1.0
 * 	Creation Time : 20th July, 2021
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.threads.main;

import java.util.ArrayList;
import java.util.List;

import com.phoenix.threads.ListThread1;
import com.phoenix.threads.ListThread2;

public class ListThreadMain {

	public static void main(String[] args) {
		
		List<String> cities = new ArrayList<>();
		cities.add("Mumbai");
		cities.add("Delhi");
		cities.add("Kolkata");
		System.out.println("In main : " + cities);
		
		// Multiple Threads are Operating on common object cities
		Thread t1 = new ListThread1(cities);
		Thread t2 = new ListThread2(cities);
				
		t1.start();
		t2.start();

	}

}
