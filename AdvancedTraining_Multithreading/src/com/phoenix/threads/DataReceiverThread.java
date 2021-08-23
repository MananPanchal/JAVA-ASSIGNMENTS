/*	Author : manan.panchal@stltech.in
 * 	Version : 1.0
 * 	Creation Time : 20th July, 2021
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.threads;

import java.util.Scanner;

public class DataReceiverThread extends Thread {
	
	int arr[];

	public DataReceiverThread(int[] arr) {
		super();
		this.arr = arr;
	}
	
	@Override
	public void run() {
		try {
			synchronized (arr) {
				Scanner sc = new Scanner(System.in);
				for(int i=0; i<arr.length; i++) {
					System.out.println("Enter data : ");
					int data = sc.nextInt();
					arr[i] = data;
					Thread.sleep(200);
				}
			arr.notify();
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
