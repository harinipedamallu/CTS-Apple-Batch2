package com.cts.training.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodEx {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = Arrays.asList("First", "Second", "Third", "Fourth", "Fifth");

		/*
		Collections.sort(names);
		System.out.println("Sorted names : " + names); // natural Order
		*/
		
		names.sort(Comparator.naturalOrder());
		System.out.println("Sorted names : " + names); 
		
		
		names.sort(Comparator.reverseOrder());
		System.out.println("Reverse Sorted names : " + names); 
		
		
	}

}
