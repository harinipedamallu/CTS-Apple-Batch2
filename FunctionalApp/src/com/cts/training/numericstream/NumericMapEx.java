package com.cts.training.numericstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = IntStream.range(1, 10)
			.mapToObj(value -> new Integer(value + 5)) // Stream<Integer>
			.collect(Collectors.toList());

		System.out.println("Converted to Object : " + numbers);
		
		Double sum = IntStream.range(1, 10)
				.mapToDouble(value -> value) // DoubleStream
				.sum();
		System.out.println("Sum : " + sum);
	}

}
