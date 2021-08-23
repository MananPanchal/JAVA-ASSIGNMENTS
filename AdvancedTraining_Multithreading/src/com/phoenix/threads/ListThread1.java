/*	Author : manan.panchal@stltech.in
 * 	Version : 1.0
 * 	Creation Time : 20th July, 2021
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.threads;

import java.util.List;

public class ListThread1 extends Thread {
	
	List<String> cities;
	
	public ListThread1() {
		
	}

	public ListThread1(List<String> cities) {
		super();
		this.cities = cities;
	}
	
	@Override
	public void run() {
		
		System.out.println("Hello");
		synchronized (cities) {
			try {
				cities.set(1, "Chennai");
				System.out.println(cities);
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Bye");
		
	}

}
