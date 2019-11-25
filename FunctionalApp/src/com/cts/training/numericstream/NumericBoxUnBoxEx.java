package com.cts.training.numericstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericBoxUnBoxEx {

	// primitive to wrapper
	public static List<Integer> boxing(){
		return IntStream.range(1, 50) // primitive type stream
				.boxed() // Stream<Integer>
				.collect(Collectors.toList());
	}
	
	public static int unBoxing() {
		List<Integer> numbers = Arrays.asList(2,3,4,5,6,7);
			return numbers.stream() // Stream<Integer>
			.mapToInt(Integer::intValue) //IntStream
			.sum();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Boxing Result : " + boxing());
		System.out.println("Sum (Un-Boxing): " + unBoxing());
	}

}
