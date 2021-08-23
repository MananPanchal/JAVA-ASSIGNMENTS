/*
 * 	Author : manan.panchal@stltech.in
 * 	Version : 1.0
 * 	Creation Time : 15th July,2021
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.interfaces.functional;

public class LambdaExpressionDemo {
	
	public void doMath(Addable ob) {
		
		System.out.println(ob.add(101.0, 201.0));
		
	}

	public static void main(String[] args) {
		
		Movable m = () -> System.out.println("Anonymous Object Moves.");
		m.move();
		
		
		Jumpable j = () -> System.out.println("Jumping.");
		j.jump();
		
		
		Addable a1 = (double x, double y) -> { return x+y; };
		double res1 = a1.add(100.0, 200.0);
		System.out.println("Addition of 100 and 200 : " + res1);
		
		Addable a2 = (x,y) -> { return x+y; };
		double res2 = a2.add(1000.0, 2000.0);
		System.out.println("Addition of 10 and 20 : " + res2);
		
		Addable a = (x,y) -> x+y;
		double res = a.add(10.0, 20.0);
		System.out.println("Addition of 10 and 20 : " + res);
		
		
		// Calling default method
		float res3 = a1.addFloats(2.3f, 6.4f);
		System.out.println("Addititon of Floats : " + res3);
		
		// Invoking static method of interface
		Addable.show();
		
		
		
		Greeting g = (personName) -> "Hello " + personName;
		System.out.println(g.greet("John"));
		
		
		LambdaExpressionDemo ref = new LambdaExpressionDemo();
		ref.doMath((c,d) -> c+d);
	}

}
