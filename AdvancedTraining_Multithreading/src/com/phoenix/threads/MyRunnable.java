/*	Author : manan.panchal@stltech.in
 * 	Version : 1.0
 * 	Creation Time : 20th July, 2021
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.threads;

import java.util.ArrayList;
import java.util.List;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		
		System.out.println("Current Thread : " + Thread.currentThread().getName());
		
		List<String> cities = new ArrayList<>();
		cities.add("Mumbai");
		cities.add("Delhi");
		cities.add("Benglore");
		cities.forEach(System.out::println);

	}

}
