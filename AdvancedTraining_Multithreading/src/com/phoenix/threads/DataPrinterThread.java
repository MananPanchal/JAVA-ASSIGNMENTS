/*	Author : manan.panchal@stltech.in
 * 	Version : 1.0
 * 	Creation Time : 20th July, 2021
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.threads;

public class DataPrinterThread extends Thread {
	
	int arr[];

	public DataPrinterThread(int[] arr) {
		super();
		this.arr = arr;
	}
	
	@Override
	public void run() {
		try {
			synchronized (arr) {
				System.out.println("Waiting to print...");
				arr.wait(20);		// Waiting
				for(int ele: arr) {
					System.out.println(ele);
					Thread.sleep(500);
				}					
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
