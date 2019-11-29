package com.cts.training.parallelstream;

import java.util.stream.IntStream;

public class CalculatorClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// perform sum of a list of number using Calculator class
		Calculator calculator = new Calculator();
		
		/*IntStream.rangeClosed(1, 1000)
				.forEach(value -> calculator.performSum(value));*/
		
		IntStream.rangeClosed(1, 1000).parallel()
				.forEach(value -> calculator.performSum(value));
		
		System.out.println("Total Sum : " + calculator.getResult());

	}

}
