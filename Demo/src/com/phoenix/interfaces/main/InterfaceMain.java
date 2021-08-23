/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 16th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.interfaces.main;

import com.phoenix.interfaces.Movable;
import com.phoenix.living.pet.Cat;
import com.phoenix.living.wild.Tiger;
import com.phoenix.machines.HumanRobot;
import com.phoenix.planets.Earth;
import com.phoenix.planets.Jupiter;
import com.phoenix.planets.Planet;
import com.phoenix.vehicles.cars.Car;

public class InterfaceMain {
		
	public static void main(String[] args) {
		
		Movable m1,m2,m3,m4,m5,m6;
		
		System.out.println("Earth Object: ");
		m1 = new Earth();
		((Planet) m1).setData(1);
		System.out.println(m1.toString());
		((Earth) m1).move();
		((Earth) m1).rotate();
		((Earth) m1).revolve();
		System.out.println("Life is on earth: " + ((Earth) m1).supportsLife());
		
		System.out.println();
		
		System.out.println("Jupiter Object: ");
		m2 = new Jupiter();
		((Planet) m2).setData(79);
		System.out.println(m2.toString());
		((Jupiter) m2).move();
		((Jupiter) m2).rotate();
		((Jupiter) m2).revolve();
		System.out.println("Life is on earth: " + ((Jupiter) m2).supportsLife());
		
		System.out.println();
		
		System.out.println("Tiger Object: ");
		m3 = new Tiger();
		((Tiger) m3).move();
		((Tiger) m3).jump();
		((Tiger) m3).run();
		((Tiger) m3).walk();
		
		System.out.println();
		
		System.out.println("Cat Object: ");
		m4 = new Cat();
		((Cat) m4).move();
		((Cat) m4).jump();
		((Cat) m4).run();
		((Cat) m4).walk();
		
		System.out.println();
		
		System.out.println("Car Object: ");
		m5 = new Car();
		((Car) m5).start();
		((Car) m5).move();
		((Car) m5).run();
		((Car) m5).stop();
		
		
		System.out.println();
		
		System.out.println("HumanRobot Object: ");
		m6 = new HumanRobot();
		((HumanRobot) m6).jump();
		((HumanRobot) m6).run();
		((HumanRobot) m6).walk();
		((HumanRobot) m6).move();
			

		
	}

}
