package com.phoenix.clones;

import com.phoenix.dates.Date;
import com.phoenix.models.Product;

public class CloneDemo {

	public static void main(String[] args) {
		
		Product product = new Product(3402, "Laptop", "HP", 45000.00f, new Date(4,10,2019));
		System.out.println("Original Product : " + product);
		
		System.out.println();
		
		try {
			// Create copy  // Shallow Copying
			Product clonedProd = (Product) product.clone();
			System.out.println("Cloned Product : " + clonedProd);
			
			// so changes on copy make changes in original -> shallow copy
			clonedProd.getMfgDate().setDd(25);
			
			System.out.println("Original Product : " + product);
			System.out.println("Cloned Product : " + clonedProd);
			
			
			
			
			
		/*	
			if(clonedProd == product)
				System.out.println("Single Object");
			else
				System.out.println("Different Objects");
			
			System.out.println();
			
			// Create Copy of copy
			Product cloneClonedProd = (Product) clonedProd.clone();
			System.out.println("Clone of Cloned Product : " + cloneClonedProd);
		*/	
			
			
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		

	}

}
