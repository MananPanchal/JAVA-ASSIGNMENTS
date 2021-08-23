/*	Author : manan.panchal@stltech.in
 * 	Version : 1.0
 * 	Creation Time : 20th July, 2021
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.threads;

public class MyThread extends Thread {

	@Override
	public void run() {
	
		try {
			for(int i=0; i<5; i++) {
				
				System.out.println("Current Thread : " + Thread.currentThread().getName());
				System.out.println(i);
				Thread.sleep(1000);
			
			} 
		}	catch (InterruptedException e) {
				e.printStackTrace();
		}
	}

}
