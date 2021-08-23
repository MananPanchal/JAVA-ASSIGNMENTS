/*
 * 	Author : manan.panchal@stltech.in
 *  Date of Creation : 19th July, 2021
 * 	Version : 1.0
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.models;

import com.phoenix.dates.Date;

public class Product implements Comparable<Product>, Cloneable{
	
	public int id;
	private String name;
	protected String brand;
	public float price;
	private Date mfgDate;
	
	public Product() {
		
	}

	public Product(int id, String name, String brand, float price, Date mfgDate) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.mfgDate = mfgDate;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Date getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(Date mfgDate) {
		this.mfgDate = mfgDate;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + ", mfgDate=" + mfgDate
				+ "]";
	}

	@Override
	public int compareTo(Product o) {
		
		if(this.id > o.id)
			return 1;
		else if(this.id < o.id)
			return -1;
		else		
			return 0;
	}
	
	// Override equals method to remove duplicates in Set
	public int hashCode() {
		return id + name.hashCode() + brand.hashCode() + (int)price;
	}
	
	// Override equals method to remove duplicates in Set
	public boolean equals(Object ob) {
		
		if(!(ob instanceof Product))
			return false;
		else {
			Product p = (Product) ob;
			if(this.id == p.id && 
					this.name.equals(p.name) && 
						this.brand.equals(p.brand) && 
							this.price == p.price )
				return true;
			else
				return false;
		}	
	}
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	
}
