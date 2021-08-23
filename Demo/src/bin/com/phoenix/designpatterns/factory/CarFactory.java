/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 16th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.designpatterns.factory;

import com.phoenix.designpatterns.factory.cars.Car;
import com.phoenix.designpatterns.factory.cars.CoupleCar;
import com.phoenix.designpatterns.factory.cars.LuxuryCar;
import com.phoenix.designpatterns.factory.cars.SedanCar;
import com.phoenix.designpatterns.factory.cars.SportCar;

public class CarFactory {
	
	public static Car newCar(String carType) {
		
		if("SedanCar".equals(carType))
			return new SedanCar();
		
		else if("CoupleCar".equals(carType))
			return new CoupleCar();
		
		else if("SportCar".equals(carType))
			return new SportCar();
		
		else if("LuxuryCar".equals(carType))
			return new LuxuryCar();
		
		else
			return null;		
		
	}
	
}
