package com.cts.training.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ConversionEx {

	
	public static void main(String[] args) {
		// Converting LocatDate, LocalTime to LocalDateTime and vice-versa
		
		LocalDate localDate = LocalDate.now();
		LocalDateTime localDateTime = localDate.atTime(LocalTime.now());
		
		LocalTime localTime = LocalTime.now();
		LocalDateTime localDateTimePro = localTime.atDate(localDate);

		
		LocalDate localDatePro =  localDateTime.toLocalDate();
		LocalTime localTimePro = localDateTime.toLocalTime();
		
		
	}

}
