/*
 * 	Author : manan.panchal@stltech.in
 * 	Version : 1.0
 * 	Creation Time : 16th July,2021
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.datetimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		
		// LocalDate
		LocalDate date = LocalDate.now();
		System.out.println(date);
				
		LocalDate anyDate = LocalDate.of(1989, 7, 15);
		System.out.println(anyDate);
		
		
		System.out.println();
		
		
		// LocalTime
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		LocalTime anyTime = LocalTime.of(5, 23, 56);
		System.out.println(anyTime);
		
				
		System.out.println();
		
		
		// LocalDateTime
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		LocalDateTime anyDateTime = LocalDateTime.of(anyDate, anyTime);
		System.out.println(anyDateTime);
		
				
		System.out.println();
		
		
		// ZonedDateTime
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		ZoneId defaultZone = ZoneId.systemDefault();
		System.out.println(defaultZone);
			
		System.out.println();
		
		Set<String> zones = ZoneId.getAvailableZoneIds();
		// zones.stream().sorted().forEach(System.out::println);
		zones.stream()
				.sorted()
				.filter(z->z.startsWith("I") || z.startsWith("America"))
				.forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("Custom ZonedDateTime");
		ZoneId zn = ZoneId.of("US/Hawaii");
		ZonedDateTime zdt1 = ZonedDateTime.of(anyDateTime, zn);
		System.out.println(zdt1);
		

	}

}
