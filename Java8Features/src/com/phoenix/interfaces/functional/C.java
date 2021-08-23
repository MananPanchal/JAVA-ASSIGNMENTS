package com.phoenix.interfaces.functional;

public class C implements A,B{

	// Both A,B has same method then have to overrides in this class
//	public void test() {
//		System.out.println("C");
//	}
	
	static void show() {
		System.out.println("C");
	}

}
