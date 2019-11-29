package com.cts.training.parallelstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelCheckEx {

	// traverse through a list of integers and perform sum of all the value
	
	public static int sequentialSum(List<Integer> numbers) {
		
		long start = System.currentTimeMillis();
		
		int total = numbers.stream()
				.reduce(0, (x, y)-> x+y); 
		
		long end = System.currentTimeMillis();
		
		long diff = end - start;
		System.out.println("Sequential time  : " + diff);
		return total;
	}
	
	public static int parallelSum(List<Integer> numbers) {
		
		long start = System.currentTimeMillis();
		
		int total = numbers.parallelStream()
				.reduce(0, (x, y)-> x+y); // perform unboxing behind the scene
		
		long end = System.currentTimeMillis();
		
		long diff = end - start;
		System.out.println("Parallel time  : " + diff);
		return total;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// list of integers
		List<Integer> numbers = IntStream.rangeClosed(1, 1000) // primitive int Stream
								.boxed() // Stream<Integer>
								.collect(Collectors.toList());
		
		System.out.println("Sequential Total : " + sequentialSum(numbers));
		System.out.println("Parallel Total : " + parallelSum(numbers));
		
								
	}

}
