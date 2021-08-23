/*
 * 	Author : manan.panchal@stltech.in
 *  Date of Creation : 16th July, 2021
 * 	Version : 1.0
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.phoenix.models.Product;

public class SortingListDemo {

	public static void main(String[] args) {
		
		List<Product> prodList = new ArrayList<Product>();
		prodList.add(new Product(1003, "Laptop", "HP", 35600.00f));
		prodList.add(new Product(1005, "Refrigerator", "Whirlpool", 38200.00f));
		prodList.add(new Product(1002, "Mobile", "Redmi", 17999.00f));
		prodList.add(new Product(1007, "Mobile", "Samsung", 23800.00f));
		prodList.add(new Product(1001, "LED TV", "Sony", 57000.00f));
		
		
		Collections.sort(prodList);
		prodList.forEach(System.out::println);
		
		
		System.out.println("\n");
		
		
		// Java 8
		prodList.sort(Comparator.naturalOrder());
		prodList.forEach(System.out::println);
		
		System.out.println("\n");
		
		prodList.sort(Comparator.reverseOrder());
		prodList.forEach(System.out::println);
		
		System.out.println("\n");
		
		// Using Stream
		System.out.println("Sorting using Stream");
		
		prodList.stream().sorted().forEach(System.out::println);
		
		System.out.println("\n");
		
		prodList.stream().sorted(Comparator.reverseOrder())
						.forEach(System.out::println);
		
		
		System.out.println("\n");
		
		
		// Sorting according to ASC order of Product Name
		System.out.println("Sorting according to ASC order of Product Name");
		prodList.sort(Comparator.comparing(Product::getName));
		prodList.forEach(System.out::println);
		
		
		System.out.println("\n");
		
		
		System.out.println("Sorting according to DESC order of Product Name");
		prodList.sort(Comparator.comparing(Product::getName).reversed());
		prodList.forEach(System.out::println);
		
		
		System.out.println("\n");
		
		
		// Sorting according to ASC order of Product Brand
		System.out.println("Sorting according to ASC order of Product Brand");
		prodList.sort(Comparator.comparing(Product::getBrand));
		prodList.forEach(System.out::println);
		
		System.out.println("\n");
		
		System.out.println("Using Stream Sorting according to ASC order of Product Brand");
		prodList.stream().sorted(Comparator.comparing(Product::getBrand))
					.forEach(System.out::println);
		
		
		System.out.println("\n");
		
		
		System.out.println("Sorting according to DESC order of Product Brand");
		prodList.sort(Comparator.comparing(Product::getBrand).reversed());
		prodList.forEach(System.out::println);
		
		System.out.println("\n");
		
		System.out.println("Using Stream Sorting according to DESC order of Product Brand");
		prodList.stream().sorted(Comparator.comparing(Product::getBrand).reversed())
					.forEach(System.out::println);
		
		
		System.out.println("\n");
		
		
		// Sorting according to ASC order of Product Price
		System.out.println("Sorting according to ASC order of Product Price");
		prodList.sort(Comparator.comparing(Product::getPrice));
		prodList.forEach(System.out::println);
		
		
		System.out.println("\n");
		
		
		System.out.println("Sorting according to DESC order of Product Price");
		prodList.sort(Comparator.comparing(Product::getPrice).reversed());
		prodList.forEach(System.out::println);
		
		
		
		System.out.println("\n");
		
		
		System.out.println("Using Stream Sorting according to ASC order of Product Name and then Product Brand");
		prodList.stream()
				.sorted(Comparator.comparing(Product::getName).thenComparing(Product::getBrand))
				.forEach(System.out::println);
		

		System.out.println("\n");
		
		
		System.out.println("Using Stream Sorting according to ASC order of Product Name and then DESC Product Brand");
		prodList.stream()
				.sorted(Comparator.comparing(Product::getName).thenComparing(Product::getBrand, Comparator.reverseOrder()))
				.forEach(System.out::println);
		
		System.out.println("\n");
		
		
		System.out.println("Using Stream Sorting according to ASC order of Product Name and then DESC Product Brand");
		prodList.stream()
				.sorted(Comparator.comparing(Product::getName).thenComparing(Product::getBrand, (brand1, brand2)->brand2.compareTo(brand1) ))
				.forEach(System.out::println);
		
		System.out.println("\n");
		
		
		System.out.println("Using Stream Sorting according to DESC order of Product Name and then ASC Product Brand");
		prodList.stream()
				.sorted(Comparator.comparing(Product::getName).reversed().thenComparing(Product::getBrand))
				.forEach(System.out::println);
		
		
		System.out.println("\n");
		
		
		System.out.println("Using Stream Sorting according to DESC order of Product Name and then DESC Product Brand");
		prodList.stream()
				.sorted(Comparator.comparing(Product::getName).thenComparing(Product::getBrand).reversed())
				.forEach(System.out::println);

		

	}

}
