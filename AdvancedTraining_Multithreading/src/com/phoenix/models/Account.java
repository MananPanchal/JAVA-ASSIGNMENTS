/*	Author : manan.panchal@stltech.in
 * 	Version : 1.0
 * 	Creation Time : 20th July, 2021
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.models;

public class Account {
	
	private int accNo;
	private String ownerName;
	private double balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int accNo, String ownerName, double balance) {
		super();
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}
	
	// Business Logic Method
	public synchronized void withdraw(double amount) throws InterruptedException {
		
		double currentBalance = getBalance();
		System.out.println("Balance before withdraw : " + currentBalance + " seen by " + 
							Thread.currentThread().getName());
		currentBalance = currentBalance - amount;
		Thread.sleep(1000);
		setBalance(currentBalance);
		System.out.println("Balance after withdraw : " + currentBalance + " seen by " + 
							Thread.currentThread().getName());
		Thread.sleep(1000);
		
	}
	
	
}
