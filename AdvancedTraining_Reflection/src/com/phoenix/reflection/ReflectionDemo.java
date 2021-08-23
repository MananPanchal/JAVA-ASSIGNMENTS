/*
 * 	Author : manan.panchal@stltech.in
 *  Date of Creation : 19th July, 2021
 * 	Version : 1.0
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.phoenix.models.Product;

public class ReflectionDemo {

	public static void main(String[] args) {
		
		try {
			
//			Class c = Class.forName("com.phoenix.models.Product");
			Class c = Class.forName("com.phoenix.models.ElectronicProduct");
//			Class c = Class.forName("java.lang.Integer");
			System.out.println("class is Loaded.");
			
		/*	
			// Creating an Object using Reflection
			Product p = (Product) c.newInstance();
			System.out.println("Object of Product is created using Reflection.");
			p.setId(1001);
			p.setName("Mobile");
			p.setBrand("Samsung");
			p.setPrice(23400.00f);
			System.out.println(p);
		*/
			
			// Only public fields (attributes) names are getting
			Field fArr1[] = c.getFields();
			for(Field f: fArr1)
				System.out.println(f.getName());
		
			
			System.out.println();
			
			
			// All public,private etc fields returns but not inherited class
			Field fArr2[] = c.getDeclaredFields();
			for(Field f: fArr2)
				System.out.println(f.getName());
			
			
			System.out.println();
			
			
			Field fArr3[] = c.getDeclaredFields();
			for(Field f: fArr3)
				System.out.println(f);
			
			
			System.out.println();
			
			
			// also get inherited 
			Field fArr4[] = c.getFields();
			for(Field f: fArr4)
				System.out.println(f);
			
			
			System.out.println("\n");
			
			
			
			// Getting all methods of class also inherited class
			Method mArr1[] = c.getMethods();
			for(Method m: mArr1)
				System.out.println(m.getName());
			
			
			System.out.println("\n");
			
			
			Method mArr2[] = c.getMethods();
			for(Method m: mArr2)
				System.out.println(m);
			
			
			System.out.println("\n");
			
			
			// getting non-public methods but not getting methods of inherited class
			Method mArr3[] = c.getDeclaredMethods();
			for(Method m: mArr3)
				System.out.println(m);
			
			
			
			System.out.println("\n");
			
			
			// Getting Constructors
			Constructor cArr1[] = c.getConstructors();
			for(Constructor cr: cArr1)
				System.out.println(cr.getName());
			
			
			System.out.println("\n");
			
			
			Constructor cArr2[] = c.getConstructors();
			for(Constructor cr: cArr2)
				System.out.println(cr);
			
			
			
			System.out.println("\n");
			
			
			// also getting non-public constructors
			Constructor cArr3[] = c.getDeclaredConstructors();
			for(Constructor cr: cArr3)
				System.out.println(cr);
			
			
			System.out.println("\n");
			
			
			
			Constructor cArr4[] = c.getDeclaredConstructors();
			for(Constructor cr: cArr4)
				System.out.println(cr.getName());
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
