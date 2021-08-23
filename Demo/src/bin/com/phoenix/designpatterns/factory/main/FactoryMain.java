/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 16th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.designpatterns.factory.main;

import java.util.Scanner;

import com.phoenix.designpatterns.factory.CarFactory;
import com.phoenix.designpatterns.factory.cars.Car;

public class FactoryMain {

	public static void main(String[] args) {
			
		System.out.print("Enter the car type : ");
		Scanner sc = new Scanner(System.in);
		String carType = sc.nextLine();
				
		Car c1 = CarFactory.newCar(carType);
		
		if(c1 != null) {			
			c1.start();
			c1.run();
			c1.stop();			
		}	
		else
			System.out.println("This is a new car I think.");

	}

}
