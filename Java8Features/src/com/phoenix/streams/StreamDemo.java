/*
 * 	Author : manan.panchal@stltech.in
 * 	Version : 1.0
 * 	Creation Time : 16th July,2021
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.phoenix.models.Product;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Product> prodList = new ArrayList<Product>();
		prodList.add(new Product(1003, "Laptop", "HP", 35600.00f));
		prodList.add(new Product(1005, "Refrigerator", "Whirlpool", 38200.00f));
		prodList.add(new Product(1002, "Mobile", "Redmi", 17999.00f));
		prodList.add(new Product(1007, "Mobile", "Samsung", 23800.00f));
		prodList.add(new Product(1001, "LED TV", "Sony", 57000.00f));
		
	/*	
		List<Product> products1 = new ArrayList<Product>();
		// Traditional
		for(Product p: prodList) {
			if(p.getPrice()>20000.00)
				// System.out.println(p);
				products1.add(p);
		}
		
		products1.forEach(System.out::println);
	*/
		
	/*	
		Stream<Product> prodStream = prodList.stream();
		
		Stream<Product> filteredStream = prodStream.filter(p -> p.getPrice() > 20000.00f);
		
		List<Product> filteredProductList = filteredStream.collect(Collectors.toList());
		
		filteredProductList.forEach(p -> System.out.println(p));
		
		
		System.out.println("\n");
	*/	
		
		
		// Stream Pipeline
		List<Product> products = prodList.stream()
				.filter(p -> p.getPrice() > 20000.00f) // Intermediate Operation
				.collect(Collectors.toList()); // Terminal
		
		products.forEach(System.out::println);
		
		
		System.out.println();
		
		
		List<Float> prodPrices = prodList.stream()
								.filter(p -> p.getPrice() > 20000.00f) // Intermediate
								.map(product -> product.getPrice())	// Intermediate
								.collect(Collectors.toList()); // Terminal Operation
		
		prodPrices.forEach(System.out::println);
		
		
		System.out.println();
		
		
		// Getting no of product
		long prodCount = prodList.stream().count();
		System.out.println("No of Products in a list : " + prodCount);
		
		
		
		System.out.println();
		
		
		// Getting max price of Product
		Product prodMaxPrice = prodList.stream()
								.max( (p1,p2) -> p1.getPrice() > p2.getPrice() ? 1 : -1 )
								.get();
		
		System.out.println("Product having maximum price: " + prodMaxPrice);
		System.out.println("Product having maximum price: " + prodMaxPrice.getPrice());
		
		
		// Getting min price of Product
		Product prodMinPrice = prodList.stream()
								.min( (p1,p2) -> p1.getPrice() > p2.getPrice() ? 1 : -1 )
								.get();
		
		System.out.println("Product having minimum price: " + prodMinPrice);
		
		
		
		// Getting only Max Price of Product
		float maxPrice = prodList.stream()
							.map(p -> p.getPrice())	// Intermediate
							.max( (price1,price2) -> price1 > price2 ? 1 : -1 )	// Terminal
							.get();
		System.out.println("Max Price: " + maxPrice);
		
		
		// Getting only Min Price of Product
		float minPrice = prodList.stream()
				.map(p -> p.getPrice())	// Intermediate
				.min( (price1,price2) -> price1 > price2 ? 1 : -1 )	// Terminal
				.get();
		System.out.println("Min Price: " + minPrice);
				
	

	}

}
