/*
 * 	Author : manan.panchal@stltech.in
 * 	Version : 1.0
 * 	Creation Time : 15th July,2021
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.optional;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

import com.phoenix.models.Product;

public class OptionalDemo {

	public static void main(String[] args) {
		
		Optional<Integer> op = Optional.empty();
		if(op.isPresent())
			System.out.println(op.get());
		else
			System.out.println("No Value");
		
		
		Optional<Integer> opi = Optional.of(100);
		if(opi.isPresent())
			System.out.println(opi.get());
		else
			System.out.println("No Value");
		
		
		Consumer<Integer> c = n -> System.out.println(n);
		opi.ifPresent(c);
		
		opi.ifPresent(n -> System.out.println(n));
		
		Optional<String> ops = Optional.ofNullable("Hello");
		System.out.println(ops.get());
		
		System.out.println(op.orElse(200));
		System.out.println(opi.orElse(200));
		
		System.out.println();
		
		System.out.println(op.orElseGet(() -> 300));
		System.out.println(opi.orElseGet(() -> 300));
		
		System.out.println();
		
		Supplier<Exception> sEx = () -> new Exception("No Value");
		Exception e = sEx.get();
		
		// System.out.println(op.orElseThrow(() -> new ArithmeticException("Error")));
		
		Optional<Product> opp = Optional.of(new Product(1001, "Laptop", "HP", 34000.00f));
		if(opp.isPresent())
			System.out.println(opp.get());

	}

}
