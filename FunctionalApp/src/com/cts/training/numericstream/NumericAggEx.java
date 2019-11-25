package com.cts.training.numericstream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericAggEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = IntStream.rangeClosed(1, 50).sum();
		System.out.println("Sum : " + sum);
		
		OptionalInt max = IntStream.rangeClosed(1, 50).max();
		System.out.println("Max : " + max.getAsInt());
		
		OptionalInt min = IntStream.rangeClosed(1, 50).min();
		System.out.println("Min : " + min.getAsInt());

		OptionalDouble avg =  IntStream.rangeClosed(1, 50).average();
		System.out.println("Average : " + avg.getAsDouble());
	}

}
