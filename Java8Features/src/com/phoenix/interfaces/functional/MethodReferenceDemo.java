/*
 * 	Author : manan.panchal@stltech.in
 * 	Version : 1.0
 * 	Creation Time : 15th July,2021
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.interfaces.functional;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		
		// Static Method Reference
		Movable m = MyClass::aMethod;
		m.move();
		

		YourClass ob = new YourClass();
		// Instance Method Reference on Specific Object
		m = ob::yourMethod;
		m.move();
		
		
		// Instance Method Reference on Arbitrary Object
		StringMerger sm = String::concat;
		System.out.println(sm.merge("Hello"," World!"));
		
		
		// Constructor Reference
		Messaging ob1 = Message::new;
		Message msg = ob1.getObject("Hello");
		System.out.println(msg.getMsg());

	}

}
