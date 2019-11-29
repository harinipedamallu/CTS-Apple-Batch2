package com.cts.training.numericstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamEx {

	public static int sumOfNumber(List<Integer> numbers) {
		return numbers.stream()// Stream<Integer>
			.reduce(0, Integer::sum); // Un-boxing Integer --> int
	}
	
	public static int sumOfNumberIntStream() {
		return IntStream.rangeClosed(1, 6)
			.sum();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		
		// System.out.println("Sum of numbers : " + sumOfNumber(numbers));
		// System.out.println("Sum of numbers (IntStream) : " + sumOfNumberIntStream());
		
		IntStream intStream = IntStream.range(1, 50);
		
		System.out.println("Total elements in stream : " + intStream.count());
		
		// intStream.forEach(System.out::println);
		
		LongStream.rangeClosed(1, 50).asDoubleStream().forEach(System.out::println);
	}

}
