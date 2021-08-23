/*
 * 	Author : manan.panchal@stltech.in
 *  Date of Creation : 19th July, 2021
 * 	Version : 1.0
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.models;

public class ElectronicProduct extends Product{
	
	public int electronicId;
	private String label;
	
	private int getElectronicId() {
		return electronicId;
	}
	public void setElectronicId(int electronicId) {
		this.electronicId = electronicId;
	}
	String getLabel() {
		return label;
	}
	protected void setLabel(String label) {
		this.label = label;
	}	
	
	private ElectronicProduct() {
		// TODO Auto-generated constructor stub
	}
	public ElectronicProduct(int electronicId, String label) {
		super();
		this.electronicId = electronicId;
		this.label = label;
	}
	
	

}
