package com.cts.training.dates;

import java.time.Duration;
import java.time.Instant;

public class InstantEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instant instant = Instant.now(); // number of sec elapsed since epoch time
		
		System.out.println(instant);
		
		System.out.println("Epoch Second : " + instant.getEpochSecond());
		
		Instant instantCustom = Instant.ofEpochSecond(5000); // 5000 sec from epoch time
		
		System.out.println("Diff : " +  Duration.between(instantCustom, instant).getSeconds());
	}

}
