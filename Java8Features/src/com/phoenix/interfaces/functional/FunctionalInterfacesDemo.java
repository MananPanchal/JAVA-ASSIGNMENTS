/*
 * 	Author : manan.panchal@stltech.in
 * 	Version : 1.0
 * 	Creation Time : 15th July,2021
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.interfaces.functional;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import com.phoenix.models.Product;

public class FunctionalInterfacesDemo {

	public static void main(String[] args) {
		
		// Predicate
		Predicate<Integer> p = n1 -> n1 > 10;
		boolean res = p.test(12);
		System.out.println(res);
		System.out.println(p.test(10));
		
		System.out.println();
		
		Predicate<String> p1 = s -> s.equals("Java");
		System.out.println(p1.test("Java"));
		System.out.println(p1.test("Python"));
		
		
		System.out.println();
		
		
		// Consumer - accepts a single input argument and returns nothing
		Consumer<String> c1 = s -> System.out.println(s);
		c1.accept("Welcome to Functional Programming in Java");
		
		Consumer<Integer> c2 = n -> System.out.println(n);
		c2.accept(100);

		
		System.out.println();
		
		
		// Supplier - not accepts input
		Supplier<Double> s1 = () -> 12.5;
		System.out.println(s1.get());
		
		Supplier<String> s2 = () -> "Good Evening";
		System.out.println(s2.get());
		
		Supplier<ArrayList<Integer>> s3 = ArrayList::new;
		ArrayList<Integer> numList = s3.get();
		System.out.println(numList.size());
		
		Consumer<Integer> c4 = ele -> numList.add(ele);
		c4.accept(100);
		c4.accept(70);
		c4.accept(80);
		c4.accept(10);
		c4.accept(60);
		System.out.println(numList.size());
		
		
		System.out.println();
		
		
		// Function - accepts one argument and produces or returns a result
		Function<String, Integer> f1 = s -> Integer.valueOf(s);
		System.out.println(f1.apply("34000"));
		
		
		System.out.println();
		
		
		// Product 
		Supplier<Product> s5 = () -> new Product(1703, "Laptop", "Asus", 32800.00f);
		Product pob = s5.get();
		
		Consumer<Product> c6 = pob1 -> System.out.println(pob1);
		
		Function<Product, Float> f7 = product -> product.getPrice();
		System.out.println(f7.apply(pob));
		
		Function<Product, String> f8 = product -> product.getBrand();
		System.out.println(f8.apply(pob));
		
		
		
		System.out.println();
		
		
		// BiPredicate
		BiPredicate<Integer,Double> bp1 = (i,d) -> i >= d;
		System.out.println(bp1.test(123, 123.0));
		System.out.println(bp1.test(23, 34.0));
		
		// BiConsumer
		BiConsumer<Integer, String> bc1 = (n,s) -> System.out.println(n + "\t" + s);
		bc1.accept(100, "Hello");
		bc1.accept(pob.getId(), pob.getName());
		
		// BiFunction
		BiFunction<String, Integer, Boolean> bf1 = (s,n) -> s.equals(n);
		System.out.println(bf1.apply("100", 100));
		
		BiFunction<String, Integer, Boolean> bf2 = (s,n) -> n == Integer.parseInt(s);
		System.out.println(bf2.apply("100", 100));
		
		
		System.out.println();
		
				
		// UnaryOperator
		UnaryOperator<String> u1 = s -> s.toUpperCase();
		System.out.println(u1.apply("Hello"));
		System.out.println(u1.apply(pob.getBrand()));
		System.out.println(u1.apply(pob.getName()));
		
		// BinaryOperator
		BinaryOperator<String> b1 = (ss1,ss2) -> ss1.concat(ss2);
		System.out.println(b1.apply("Inter", "national"));
		System.out.println(b1.apply("Suresh", " Raina"));

		
	}

}
