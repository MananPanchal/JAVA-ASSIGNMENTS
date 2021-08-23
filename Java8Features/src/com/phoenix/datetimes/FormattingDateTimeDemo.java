/*
 * 	Author : manan.panchal@stltech.in
 * 	Version : 1.0
 * 	Creation Time : 16th July,2021
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.datetimes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDateTimeDemo {

	public static void main(String[] args) {
		
		// LocalDate
		LocalDate date = LocalDate.of(1989, 7, 15);
		System.out.println(date);
		
		System.out.println();
		
		DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		String formattedDate1 = date.format(formatter1);
		System.out.println("FULL : " + formattedDate1);

		DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		String formattedDate2 = date.format(formatter2);
		System.out.println("LONG : " + formattedDate2);

		DateTimeFormatter formatter3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		String formattedDate3 = date.format(formatter3);
		System.out.println("MEDIUM : " + formattedDate3);

		DateTimeFormatter formatter4 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);		
		String formattedDate4 = date.format(formatter4);		
		System.out.println("SHORT : " + formattedDate4);
		
		System.out.println();
		
		
		// Custom DateFormat
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MMM dd, yyyy");
		System.out.println("Custom Format : " + date.format(dtf1));
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd MMMM, yyyy");
		System.out.println("Custom Format : " + date.format(dtf2));
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Custom Format : " + date.format(dtf3));
		
		
		System.out.println();
		
		LocalTime anyTime = LocalTime.of(15, 23, 56);
		System.out.println(anyTime);
		
		DateTimeFormatter timeFmt1 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		String fmtTime1 = anyTime.format(timeFmt1);
		System.out.println("Formatted Time : " + fmtTime1);
		
		DateTimeFormatter timeFmt2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		String fmtTime2 = anyTime.format(timeFmt2);
		System.out.println("Formatted Time : " + fmtTime2);
		
		DateTimeFormatter timeFmt3 = DateTimeFormatter.ofPattern("hh:mm:ss");
		String fmtTime3 = anyTime.format(timeFmt3);
		System.out.println("Formatted Time : " + fmtTime3);
		

	}

}
