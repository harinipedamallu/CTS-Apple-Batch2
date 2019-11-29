package com.cts.training.dates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
// import java.time.temporal.TemporalAdjuster;

public class LocalDateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate localDate = LocalDate.now();
		System.out.println("Current Date is :" + localDate); // toString()
		
		// factory method to create an instance of LocalDate using custom value
		LocalDate localDateCustom = LocalDate.of(2018, 6, 12);
		System.out.println("Custom Date :" + localDateCustom);
		
		System.out.println("Custom Year Day Date : " + LocalDate.ofYearDay(2018, 145));
		System.out.println("Epoch Day Date : " + LocalDate.ofEpochDay(5)); // 5 days from epoch date
		
		
		// getting individual info from LocalDate
		System.out.println(localDate.getMonth());
		System.out.println(localDate.getMonthValue());
		System.out.println(localDate.getDayOfWeek());
		System.out.println(localDate.getDayOfYear());
		System.out.println(localDate.getDayOfMonth());
		System.out.println("General get method :" + localDate.get(ChronoField.DAY_OF_MONTH));
		
		// Modify LocalDate Object
		System.out.println("After 20 days : " + localDate.plusDays(20));
		System.out.println("After 20 days General : " + localDate.plus(20, ChronoUnit.DAYS));
		System.out.println(localDate.withYear(2020));
		System.out.println(localDate.with(ChronoField.YEAR, 2020));
		System.out.println(localDate.with(TemporalAdjusters.firstDayOfNextYear()));
		System.out.println(localDate.with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.FRIDAY))); // first friday
		
		
		// direct 
		System.out.println("Is leap Year : " + localDate.isLeapYear());
		
		// comparision
		
		System.out.println(localDate.isBefore(localDateCustom));
		System.out.println(localDate.isAfter(localDateCustom));
		System.out.println(localDate.isEqual(localDateCustom));
		
 
	}

}
