package com.cts.training.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatParseEx {

	public static void parse() {
		String date1 = "2018-05-26"; // default format
		LocalDate localDate1 =  LocalDate.parse(date1);
		
		String date2 = "20180526"; //DateTimeFormatter.BASIC_ISO_DATE
		LocalDate localDate2 =  LocalDate.parse(date2, DateTimeFormatter.BASIC_ISO_DATE);
		
		// custom formatter
		String date3 = "2018|05|26"; // custom format
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
		LocalDate localDate3=  LocalDate.parse(date3, dateTimeFormatter);
		
	}
	
	public static void format() {
		// need to specify what format to get
	 	LocalDate localDate = LocalDate.now();
	 	// String formattedDate = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
	 	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
	 	String formattedDate = localDate.format(dateTimeFormatter);
	 	
	 	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	}

}
