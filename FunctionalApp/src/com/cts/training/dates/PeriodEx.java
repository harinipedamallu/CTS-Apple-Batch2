package com.cts.training.dates;

import java.time.LocalDate;
import java.time.Period;

public class PeriodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate localDate = LocalDate.now();
		LocalDate customDate = LocalDate.of(2018, 6, 25);
		
		// Period period =  localDate.until(customDate);
		Period period =  customDate.until(localDate);
		System.out.println("Years : " + period.getYears());
		System.out.println("Months : " + period.getMonths());
		System.out.println("Days : " + period.getDays());
		
		Period periodCustom = Period.ofDays(2000);
		System.out.println("Years : " + periodCustom.getYears());
		System.out.println("Months : " + periodCustom.getMonths());
		// System.out.println("Months : " + periodCustom.toTotalMonths()); 
		System.out.println("Days : " + periodCustom.getDays());
		
		Period periodDiff = Period.between(customDate, localDate);
		System.out.println("Years : " + periodDiff.getYears());
		System.out.println("Months : " + periodDiff.getMonths());
		System.out.println("Days : " + periodDiff.getDays());
		
	}

}
