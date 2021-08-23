/*	Author : manan.panchal@stltech.in
 * 	Version : 1.0
 * 	Creation Time : 20th July, 2021
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.threads.main;

import com.phoenix.threads.MyThread;

public class ThreadMain {

	// main method
	public static void main(String[] args) {
		
		System.out.println("Current Thread in main: " + Thread.currentThread().getName());
		
		// User-Defined t1 Thread
		Thread t1 = new MyThread();
		
		// User-Defined t2 Thread
		Thread t2 = new MyThread();
		
		t1.setName("John");
		t2.setName("Jane");
		
		t1.setPriority(2);
		t2.setPriority(8);
		
		t1.start();
		t2.start();
		

	}

}
