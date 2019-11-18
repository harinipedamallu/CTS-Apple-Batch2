package com.cts.training.lambdas;

import java.util.Comparator;

public class ComparatorLambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Classical Approach
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				// inbuilt criteria
				return o1.compareTo(o2);
			}
		};
		
		
		System.out.println("Comparision result : " + comparator.compare(2, 2));
		
		
		// Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b); // return is default
		// Comparator<Integer> comparatorLambda = (a, b) -> a.compareTo(b); // return is default
		Comparator<Integer> comparatorLambda = (a, b) -> {
			return a.compareTo(b);
		};
		
		System.out.println("Comparision result : " + comparatorLambda.compare(1, 2));
	}

}
