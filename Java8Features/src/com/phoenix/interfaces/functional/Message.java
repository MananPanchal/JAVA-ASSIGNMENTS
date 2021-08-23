/*
 * 	Author : manan.panchal@stltech.in
 * 	Version : 1.0
 * 	Creation Time : 15th July,2021
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.interfaces.functional;

public class Message {
	
	public String msg;
	
	public Message() {
		System.out.println("Hello, Good Morning...");
		System.out.println("Default Constructor");
	}

	public Message(String msg) {
		super();
		this.msg = msg;
		System.out.println("Parameterized Constructor");
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
