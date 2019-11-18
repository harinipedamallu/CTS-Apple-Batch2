package com.cts.training.stylecomparision;

import java.util.stream.IntStream;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// sum of integers for the range [ 0 - 100 ]
		
		// Imperative : how style
		int sum = 0;
		for(int i=0; i<=100; i++) {
			// need to write code for filteration
			sum+=i; // update of base object
			//  mutable state will have issues in multi-threaded env
		}
		
		System.out.println("Imperative sum : " + sum);
		
		// Declarative : what style
		// let the lib/system know what to do
		
		// not writing code to describe procedure
		// SQL style
		// keep on adding more functionalities
		// more readable
		// 
		
		
		int sumPro = IntStream.rangeClosed(0, 100)
						// .filter(<condition>)
						// .map(<transform>)
						// .parallel()
						.sum();
		
		System.out.println("Declarative sum : " + sumPro);
		
		
		
	}

}
