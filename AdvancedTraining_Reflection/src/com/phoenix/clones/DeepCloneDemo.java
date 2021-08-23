/*
 * 	Author : manan.panchal@stltech.in
 *  Date of Creation : 19th July, 2021
 * 	Version : 1.0
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.clones;

import com.phoenix.dates.Date;
import com.phoenix.models.Product;

public class DeepCloneDemo {

	public static void main(String[] args) {
		
		Product product = new Product(3402, "Laptop", "HP", 45000.00f, new Date(4,10,2019));
		System.out.println("Original Product : " + product);
		
		System.out.println();
		

		// Deep Copying
		
		// Get the clone of container object Product
		try {
			Product clonedProd = (Product) product.clone();
			System.out.println("Clone of Product : " + clonedProd);
			
			System.out.println();
			
			Date originalMfgDate = product.getMfgDate();
			
			// Get the clone of Contained object Mfg Date
			Date clonedMfgDate = (Date) originalMfgDate.clone();
			// deep copying
			clonedProd.setMfgDate(clonedMfgDate);
			
			// Changing the dd of Mfg Date of Cloned Product
			clonedProd.getMfgDate().setDd(25);
			
			System.out.println("Original Product : " + product);
			System.out.println("Cloned Product : " + clonedProd);
			
			
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}
