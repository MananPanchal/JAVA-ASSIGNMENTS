/*	Author : manan.panchal@stltech.in
 * 	Version : 1.0
 * 	Creation Time : 20th July, 2021
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.threads.main;

import com.phoenix.models.Account;
import com.phoenix.threads.AccountThread;

public class BankMain {

	public static void main(String[] args) {
		
		Account account = new Account(12345, "John and Jane Doe", 10000.00);
		
		Thread t1 = new AccountThread(account, 3000.00, true);
		t1.setName("John Doe");
		
		Thread t2 = new AccountThread(account, 4000.00, false);
		t2.setName("Jane Doe");
		
		t1.start();
		t2.start();

	}

}
