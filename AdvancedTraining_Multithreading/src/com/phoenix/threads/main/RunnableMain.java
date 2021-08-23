/*	Author : manan.panchal@stltech.in
 * 	Version : 1.0
 * 	Creation Time : 20th July, 2021
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.threads.main;

import com.phoenix.threads.MyRunnable;

public class RunnableMain {

	public static void main(String[] args) {
		
		Runnable r = new MyRunnable();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.setName("John");
		t2.setName("Jane");
		
		t2.start();
		t1.start();
		

	}

}
