package com.cts.training.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class StandardEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate localDate = LocalDate.now();
		System.out.println("Local Date : " + localDate); // toString()
		
		LocalTime localTime = LocalTime.now();
		System.out.println("Local Time : " + localTime);
		
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Local Date Time : " + localDateTime);
	}

}
