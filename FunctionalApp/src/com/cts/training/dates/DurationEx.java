package com.cts.training.dates;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime localTime1 = LocalTime.of(7, 20);
		LocalTime localTime2 = LocalTime.of(8, 30);
		
		long minutesDiff = localTime1.until(localTime2, ChronoUnit.MINUTES);
		System.out.println("Minutes diff : " + minutesDiff);
		
		Duration duration = Duration.between(localTime1, localTime2);
		System.out.println("Duration : " + duration.toMinutes());
		
		Duration hrsDuration = Duration.ofHours(3);
		System.out.println("Hrs : " + hrsDuration.toHours());
		System.out.println("Min : " + hrsDuration.toMinutes());
		
	}

}
