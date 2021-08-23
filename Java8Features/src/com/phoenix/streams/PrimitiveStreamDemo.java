/*
 * 	Author : manan.panchal@stltech.in
 * 	Version : 1.0
 * 	Creation Time : 16th July,2021
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.streams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreamDemo {

	public static void main(String[] args) {
		
		IntStream ins = IntStream.of(70,30,20,60,10);
		ins.forEach(System.out::println);
		
		System.out.println("\n");
		
		System.out.println("Sorting in ASC order");
		IntStream ins1 = IntStream.of(70,30,20,60,10);
		ins1.sorted().forEach(System.out::println);
		
		
		System.out.println();
		
		System.out.println("Using Iterate");
		IntStream ins2 = IntStream.iterate(1, i->i+1);
		ins2.limit(10).skip(5).forEach(System.out::println);
		
		
		System.out.println();
		
		
		System.out.println("Stream of Long type numbers");
		// LongStream ls = LongStream.range(100L, 105L);
		LongStream ls = LongStream.rangeClosed(100L, 105L); //  Inclusive 105
		ls.forEach(System.out::println);
	
	}

}
