/*	Author : manan.panchal@stltech.in
 * 	Version : 1.0
 * 	Creation Time : 20th July, 2021
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.threads.main;

import com.phoenix.threads.DataPrinterThread;
import com.phoenix.threads.DataReceiverThread;

public class InterThreadCommunicationDemo {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		
		Thread t1 = new DataReceiverThread(arr);
		Thread t2 = new DataPrinterThread(arr);
		
		t2.start();
		t1.start();
		
	}

}
