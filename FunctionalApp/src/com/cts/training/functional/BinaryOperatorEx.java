package com.cts.training.functional;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorEx {

	// lambda implementation we pass 2 integer, returns back product (integer)
	
	static BinaryOperator<Integer> product = (a, b) -> a*b;
	
	// comparator implementation (lambda) for std int comparision
	static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(product.apply(10, 20));
		
		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
		
		BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
		
		System.out.println("Maximum : " + maxBy.apply(5, 10));
		System.out.println("Minimum : " + minBy.apply(5, 10));

	}

}
